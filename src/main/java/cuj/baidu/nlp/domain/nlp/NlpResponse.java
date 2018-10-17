package cuj.baidu.nlp.domain.nlp;

import java.util.List;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 15:45
 * @Description:
 */
public class NlpResponse {
    protected String log_id;
    protected String text;                //原始单条请求文本

    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
