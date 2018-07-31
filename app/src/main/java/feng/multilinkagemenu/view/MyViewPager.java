package feng.multilinkagemenu.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

/**
 * Created by o2bobo on 2018/7/31.
 * 主页面左右滑动
 */
public class MyViewPager extends ViewPager {
    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewPager(Context context) {
        super(context);
    }
    //判断menu在x,y的位置
    public void scrollTo(int x,int y){
        if(getAdapter()==null||x>getWidth()*(getAdapter().getCount()-2)){
            return;
        }
        super.scrollTo(x,y);
    }

}
