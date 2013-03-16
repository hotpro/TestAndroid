package com.test.testandroid.testevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class EventLinearLayout extends LinearLayout {

	public EventLinearLayout(Context context) {
		super(context);
	}

	public EventLinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		System.out.println("LinearLayout::onInterceptTouchEvent::action=" + Tool.getTouchAction(ev.getAction()));
//		return super.onInterceptTouchEvent(ev);
		return true;
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		System.out.println("LinearLayout::onTouchEvent::action=" + Tool.getTouchAction(event.getAction()));
		return super.onTouchEvent(event);
//		return true;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		System.out.println("LinearLayout::onKeyDown::key=" + keyCode);
		return super.onKeyDown(keyCode, event);
//		return true;
	}
	
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		System.out.println("LinearLayout::onKeyUp::key=" + keyCode);
		return super.onKeyUp(keyCode, event);
	}
}
