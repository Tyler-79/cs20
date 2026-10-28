package skill.bilders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Pong extends JPanel implements ActionListener, KeyListener {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 500;
    private static final int PADDLE_W = 12;
    private static final int PADDLE_H = 90;
    private static final int BALL_SIZE = 16;
    private static final int WIN_SCORE = 5;

    private int leftY = HEIGHT / 2 - PADDLE_H / 2;
    private int rightY = HEIGHT / 2 - PADDLE_H / 2;

    private double ballX = WIDTH / 2.0;
    private double ballY = HEIGHT / 2.0;
    private double ballVX = 5;
    private double ballVY = 3;

    private int leftScore = 0;
    private int rightScore = 0;

    private boolean upPressed, downPressed;
    private boolean wPressed, sPressed;
    private boolean gameOver = false;

    private final Timer timer;
    private final Random random = new Random();

    public Pong() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2.setColor(Color.WHITE);

        // Dashed center line
        for (int y = 0; y < HEIGHT; y += 30) {
            g2.fillRect(WIDTH / 2 - 1, y, 2, 15);
        }

        // Paddles and ball
        g2.fillRect(25, leftY, PADDLE_W, PADDLE_H);
        g2.fillRect(WIDTH - 25 - PADDLE_W,
                    rightY, PADDLE_W, PADDLE_H);
        g2.fillOval((int) ballX, (int) ballY,
                    BALL_SIZE, BALL_SIZE);

        // Scores
        g2.setFont(new Font("Arial", Font.BOLD, 42));
        g2.drawString(String.valueOf(leftScore), WIDTH / 4, 60);
        g2.drawString(String.valueOf(rightScore),
                      WIDTH * 3 / 4, 60);

        g2.setFont(new Font("Arial", Font.PLAIN, 16));
        g2.drawString("W / S", 25, HEIGHT - 20);
        g2.drawString("UP / DOWN", WIDTH - 110, HEIGHT - 20);

        if (gameOver) {
            g2.setFont(new Font("Arial", Font.BOLD, 34));
            String message = leftScore >= WIN_SCORE
                    ? "LEFT PLAYER WINS!"
                    : "RIGHT PLAYER WINS!";

            FontMetrics fm = g2.getFontMetrics();
            g2.drawString(message,
                    (WIDTH - fm.stringWidth(message)) / 2,
                    HEIGHT / 2 - 10);

            g2.setFont(new Font("Arial", Font.PLAIN, 18));
            String restart = "Press ENTER to restart";
            fm = g2.getFontMetrics();
            g2.drawString(restart,
                    (WIDTH - fm.stringWidth(restart)) / 2,
                    HEIGHT / 2 + 30);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            movePaddles();
            moveBall();
        }
        repaint();
    }

    private void movePaddles() {
        int speed = 7;

        if (wPressed) leftY -= speed;
        if (sPressed) leftY += speed;
        if (upPressed) rightY -= speed;
        if (downPressed) rightY += speed;

        leftY = Math.max(0, Math.min(HEIGHT - PADDLE_H, leftY));
        rightY = Math.max(0, Math.min(HEIGHT - PADDLE_H, rightY));
    }

    private void moveBall() {
        ballX += ballVX;
        ballY += ballVY;

        // Bounce off top and bottom
        if (ballY <= 0 || ballY >= HEIGHT - BALL_SIZE) {
            ballVY = -ballVY;
            ballY = Math.max(0, Math.min(HEIGHT - BALL_SIZE, ballY));
        }

        // Left paddle collision
        if (ballVX < 0
                && ballX <= 25 + PADDLE_W
                && ballX + BALL_SIZE >= 25
                && ballY + BALL_SIZE >= leftY
                && ballY <= leftY + PADDLE_H) {
            bounceFromPaddle(leftY);
        }

        // Right paddle collision
        int rightX = WIDTH - 25 - PADDLE_W;
        if (ballVX > 0
                && ballX + BALL_SIZE >= rightX
                && ballX <= rightX + PADDLE_W
                && ballY + BALL_SIZE >= rightY
                && ballY <= rightY + PADDLE_H) {
            bounceFromPaddle(rightY);
        }

        // Scoring
        if (ballX + BALL_SIZE < 0) {
            rightScore++;
            checkWinner();
            resetBall(-1);
        } else if (ballX > WIDTH) {
            leftScore++;
            checkWinner();
            resetBall(1);
        }
    }

    private void bounceFromPaddle(int paddleY) {
        double paddleCenter = paddleY + PADDLE_H / 2.0;
        double ballCenter = ballY + BALL_SIZE / 2.0;

        // Hit position changes the vertical bounce angle
        double offset = (ballCenter - paddleCenter)
                / (PADDLE_H / 2.0);

        ballVX = -ballVX * 1.05;
        ballVY = offset * 6.0;

        // Keep the ball from getting too fast
        ballVX = Math.max(-10, Math.min(10, ballVX));

        // Prevent repeated collision while overlapping paddle
        if (ballVX < 0) {
            ballX = 25 + PADDLE_W;
        } else {
            ballX = WIDTH - 25 - PADDLE_W - BALL_SIZE;
        }
    }

    private void resetBall(int direction) {
        ballX = WIDTH / 2.0;
        ballY = HEIGHT / 2.0;

        ballVX = direction * (4 + random.nextDouble() * 2);
        ballVY = random.nextDouble() * 6 - 3;
    }

    private void checkWinner() {
        if (leftScore >= WIN_SCORE || rightScore >= WIN_SCORE) {
            gameOver = true;
            timer.stop();
        }
    }

    private void restartGame() {
        leftScore = 0;
        rightScore = 0;
        leftY = HEIGHT / 2 - PADDLE_H / 2;
        rightY = HEIGHT / 2 - PADDLE_H / 2;
        gameOver = false;

        resetBall(random.nextBoolean() ? 1 : -1);
        timer.start();
        requestFocusInWindow();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> wPressed = true;
            case KeyEvent.VK_S -> sPressed = true;
            case KeyEvent.VK_UP -> upPressed = true;
            case KeyEvent.VK_DOWN -> downPressed = true;
            case KeyEvent.VK_ENTER -> {
                if (gameOver) restartGame();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> wPressed = false;
            case KeyEvent.VK_S -> sPressed = false;
            case KeyEvent.VK_UP -> upPressed = false;
            case KeyEvent.VK_DOWN -> downPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Java Pong");
            Pong game = new Pong();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.add(game);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            game.requestFocusInWindow();
        });
    }
}