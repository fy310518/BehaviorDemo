# BehaviorDemo
CoordinatorLayout 事件的处理方式——behavior之 自定义Behavio

demo 比较简单 一共两个activity，分别对应 自定义 Behavior 的两种实现（介绍如下：从前辈的博客借用的^_^） 


在自定义Behavior的时候，我们需要关心的两组四个方法，为什么分为两组呢？看一下下面两种情况


1.某个view监听另一个view的状态变化，例如大小、位置、显示状态等
2.某个view监听CoordinatorLayout里的滑动状态


对于第一种情况，我们关心的是：

•layoutDependsOn方法
•onDependentViewChanged方法 


对于第二种情况，我们关心的是：

•onStartNestedScroll方法
•onNestedPreScroll方法。


最后给出前辈的博客地址：有时间可以直接去看哈............
