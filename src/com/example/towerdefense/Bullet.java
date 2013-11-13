package com.example.towerdefense;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;

public class Bullet extends Drawable{
	private TowerGameLogic mGame;
	
	private static Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);  
	private float speed = 10;
	private float distance = 0;
	private float[] pos, tan;
	private PathMeasure measure;
	private int x;
	private int y;
	private int xtarget;
	private int ytarget;
	private int radius = 5;
	Path path;
	public Bullet(int xloc, int yloc, int xtar, int ytar, TowerGameLogic g){
		mPaint.setColor(Color.RED);
		mPaint.setStrokeWidth(3);	
		mGame = g;
		x = xloc;
		y = yloc;
		xtarget = xtar;
		ytarget = ytar;
		path = new Path();
		path.moveTo(x, y);
		path.lineTo(xtarget, ytarget);
		measure = new PathMeasure(path, false);
		//speed = measure.getLength() / 30;
		pos=new float[2];
		tan=new float[2];
	}

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		canvas.drawRect(pos[0] - radius, pos[1] - radius, pos[0] + radius, pos[1] + radius, mPaint);
	}

	@Override
	public int getOpacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAlpha(int alpha) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setColorFilter(ColorFilter cf) {
		// TODO Auto-generated method stub

	}

	public void update() {
		// TODO Auto-generated method stub
		if(distance < measure.getLength()){
			// getPosTan pins the distance along the Path and
			// computes the position and the tangent.
			measure.getPosTan(distance, pos, tan);
			distance += speed;   // Traversal
		}
		else
			mGame.removeBullet(this);
	}
}
