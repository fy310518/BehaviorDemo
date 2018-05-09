package com.fy.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
     * 跟随 平移 behavior (某个view监听另一个view的状态变化，例如大小、位置、显示状态等)
 * 这里的泛型是child的类型，也就是观察者View
 * Created by fangs on 2017/12/26.
 */
public class DependentBehavior extends CoordinatorLayout.Behavior<View>{

//    带有参数的这个构造必须要重载，因为在CoordinatorLayout里利用反射去获取这个Behavior的时候就是拿的这个构造
    public DependentBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

//    我们覆写了两个方法layoutDependsOn和onDependentViewChanged，这两个方法的参数都是一样的
//    第一个不用说，就是当前的CoordinatorLayout，第二个参数是我们设置这个 Behavior 的View，第三个是我们关心的那个View
//    如何知道关心的哪个呢？layoutDependsOn 的返回值决定了一切！这里我们关心一个TextView

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof TextView;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        int offset = dependency.getTop() - child.getTop();
//        竖直方向上以像素为单位来移动view
        ViewCompat.offsetTopAndBottom(child, offset);

        return true;
    }
}
