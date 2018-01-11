package yukang.com.dome_5_day;

/**
 * Created by Administrator on 2018/1/11.
 */
//这是第四次提交了哈，我有瞎添了点东西
public class CityBean extends BaseIndexPinyinBean {

    private String city;//城市名字

    public CityBean() {
    }
    public CityBean(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getTarget() {
        return city;
    }
}
