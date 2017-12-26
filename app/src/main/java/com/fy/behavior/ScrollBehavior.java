package com.fy.behavior;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;

/**
 * 跟随滑动 Behavior (某个view监听CoordinatorLayout里的滑动状态)
 * Created by fangs on 2017/12/26.
 */
public class ScrollBehavior extends CoordinatorLayout.Behavior<View> {

    public ScrollBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


//    返回值表明这次滑动我们要不要关心，我们要关心什么样的滑动？本例：当然是y轴方向上的
    @Override
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View child, @NonNull View directTargetChild, @NonNull View target, int axes, int type) {
        return (axes & ViewCompat.SCROLL_AXIS_VERTICAL) != 0;
    }

//    让设置 Behavior 的view 跟随 关心的view 滑动
    @Override
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View child, @NonNull View target, int dx, int dy, @NonNull int[] consumed, int type) {
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type);
//        让child的scrollY的值等于目标的scrollY的值就ok啦
        int leftScrolled = target.getScrollY();
        child.setScrollY(leftScrolled);
    }

    //处理 滑动手势停止后  设置 Behavior 的View 跟随关心的view继续滑动一会儿
    @Override
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View child,
                                 View target, float velocityX, float velocityY, boolean consumed) {
//        直接将现在的y轴上的速度传递传递给child
        ((NestedScrollView) child).fling((int)velocityY);
        return true;
    }
}
