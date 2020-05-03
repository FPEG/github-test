package cn.ohinc.web.githubtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {
    @GetMapping("asd")
    public Object time() {
        class Temp {
            public Temp(String time, String extra) {
                this.time = time;
                this.extra = extra;
            }

            private String time;
            private String extra;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getExtra() {
                return extra;
            }

            public void setExtra(String extra) {
                this.extra = extra;
            }
        }
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return new Temp(dateFormat.format(now),"asdasdasd");
    }

}
