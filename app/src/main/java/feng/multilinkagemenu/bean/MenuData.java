package feng.multilinkagemenu.bean;

import java.io.Serializable;

/**
 * Created by o2bobo on 2018/7/31.
 * 列数据的bean
 */
public class MenuData implements Serializable {
    public int id;
    public String name;
    public int flag;

    public MenuData(int id, String name, int flag) {
        this.id = id;
        this.name = name;
        this.flag = flag;
    }

    public MenuData() {
    }
}
