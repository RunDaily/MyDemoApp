package legong.sophist.com.app.utils;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.util.List;

import legong.sophist.com.app.base.BaseFragment;
import legong.sophist.com.app.fragments.ContactFragment;

/**
 * Fragment管理类
 */
public class FragmentKit {

    /**
     * 封装了不同Fragment的类对象的建立/添加/隐藏的细节
     *
     * @param clazz     BaseFragment的子类
     * @param fm
     * @param container
     */
    public static void showFragment(Class<? extends BaseFragment> clazz, FragmentManager fm, @IdRes int container) {
        if (clazz == null)
            throw new RuntimeException("要实例化的类对象不能为Null");
        if (fm == null)
            throw new RuntimeException("FragmentManager不能为Null");

        FragmentTransaction transaction = fm.beginTransaction();

        //先隐藏全部fragment
        List<Fragment> fragmentList = fm.getFragments();
        for (Fragment fragment : fragmentList) {
            if (fragment instanceof BaseFragment)
                transaction.hide(fragment);
        }

        //拿到要展示的目标fragment
        Fragment target = fm.findFragmentByTag(clazz.getSimpleName());
        if (target == null) {   //没有就实例化并add
            try {
                target = clazz.newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
            if (target != null)
                transaction.add(container, target, clazz.getSimpleName());

        } else { //有就直接show
            transaction.show(target);
        }

        transaction.commit();
    }


}
