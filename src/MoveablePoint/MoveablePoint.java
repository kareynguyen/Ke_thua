package MoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed = 1.0f;
    private float ySpeed = 1.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        float [] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }
    public MoveablePoint move(){
        super.setXY(super.getX() + this.xSpeed, super.getY() + this.ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed= " + getXSpeed() + " , " + getYSpeed();

    }
}
