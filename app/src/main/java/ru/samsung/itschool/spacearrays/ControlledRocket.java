package ru.samsung.itschool.spacearrays;




public class ControlledRocket extends Rocket {
    private float targetX,targetY;
    public void touch (float targetX,float targetY){
        this.targetX = targetX;
        this.targetY = targetY;
        this.vx = targetX - x;
        this.vy = targetY - y;
        float d  = (float) Math.sqrt(vx*vx + vy*vy);
        vx = this.vx/d*5;
        vy = this.vy/d*5;
    }
    ControlledRocket(){
        super();
    }
}