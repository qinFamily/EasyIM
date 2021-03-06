package win.smartown.easyim;

import android.app.Application;

import win.smartown.easyim.im.netease.NIMServiceFactory;
import win.smartown.easyim.util.ToastUtil;

/**
 * Created by smartown on 2018/2/6 14:32.
 * <br>
 * Desc:
 * <br>
 */
public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtil.init(this);
        EasyIM.setImServiceFactory(new NIMServiceFactory(this));
    }

}
