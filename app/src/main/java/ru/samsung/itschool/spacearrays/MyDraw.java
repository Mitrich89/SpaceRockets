package ru.samsung.itschool.spacearrays;

		import android.content.Context;
		import android.graphics.Canvas;
		import android.graphics.Paint;
		import android.graphics.drawable.Drawable;
		import android.util.AttributeSet;
		import android.view.MotionEvent;
		import android.view.View;

		import java.util.ArrayList;

public class MyDraw extends View {

	ArrayList objects = new ArrayList();

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.paint = new Paint();
		this.rocket = new ControlledRocket();
		this.sky = new Sky();
		objects.add(rocket);
		objects.add(sky);
	}

	ControlledRocket rocket;
	private Paint paint;
	private Sky sky;


	@Override
	protected void onDraw(Canvas canvas) {
		for(Object obj : objects){
			if(obj instanceof Drawable)
				((Drawable)obj).draw(canvas);
		}
		this.rocket.move();
		invalidate();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		for (Object obj : objects){
			if(obj instanceof Touchable){
				((Touchable)obj).touch(event.getX(),event.getY());
			}
		}

		return super.onTouchEvent(event);
	}
}