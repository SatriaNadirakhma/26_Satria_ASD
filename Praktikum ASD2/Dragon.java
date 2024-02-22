public class Dragon {
    int x;
    int y;
    int width;
    int height;

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    public void moveRight() {
        if (x < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision();
        }
    }

    public void moveDown() {
        if (y < height) {
            y++;
        } else {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        System.out.println("Game Over");
    }

    public static void main(String[] args) {
        Dragon dragon = new Dragon(0, 0, 10, 10);
        dragon.moveRight();
        dragon.moveDown();
        dragon.printPosition(); 
        dragon.moveLeft();
        dragon.moveUp();
        dragon.printPosition(); 
        dragon.moveUp(); 
    }
}
