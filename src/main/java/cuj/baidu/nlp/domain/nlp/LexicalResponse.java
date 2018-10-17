package cuj.baidu.nlp.domain.nlp;

import java.util.List;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 14:14
 * @Description:
 *
 *
 * {
"log_id": 2461839769935064615,
"text": "百度词法分析测试",
"items": [
{
"formal": "",
"loc_details": [],
"item": "百度",
"pos": "",
"ne": "ORG",
"basic_words": ["百度"],
"byte_length": 4,
"byte_offset": 0,
"uri": ""
},
{
"formal": "",
"loc_details": [],
"item": "词",
"pos": "n",
"ne": "",
"basic_words": ["词"],
"byte_length": 2,
"byte_offset": 4,
"uri": ""
},
{
"formal": "",
"loc_details": [],
"item": "法",
"pos": "n",
"ne": "",
"basic_words": ["法"],
"byte_length": 2,
"byte_offset": 6,
"uri": ""
},
{
"formal": "",
"loc_details": [],
"item": "分析",
"pos": "v",
"ne": "",
"basic_words": ["分析"],
"byte_length": 4,
"byte_offset": 8,
"uri": ""
},
{
"formal": "",
"loc_details": [],
"item": "测试",
"pos": "vn",
"ne": "",
"basic_words": ["测试"],
"byte_length": 4,
"byte_offset": 12,
"uri": ""
}
]
}

 */
public class LexicalResponse extends NlpResponse{

    private List<Item> items;           //词汇数组，每个元素对应结果中的一个词

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "LexicalResponse{" +
                "items=" + items +
                ", log_id='" + log_id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    class Item {
        private String formal;                  //词汇的标准化表达，主要针对时间、数字单位，没有归一化表达的，此项为空串
        private List<LocDetail> loc_details;    //地址成分，非必需，仅对地址型命名实体有效，没有地址成分的，此项为空数组。
        private String item;                    //词汇的字符串
        private String pos;                     //词性，词性标注算法使用。命名实体识别算法中，此项为空串
        private String ne;                      //命名实体类型，命名实体识别算法使用。词性标注算法中，此项为空串
        private List<String> basic_words;       //基本词成分
        private int byte_length;                //字节级length（使用GBK编码）
        private int byte_offset;                //在text中的字节级offset（使用GBK编码）
        private String uri;                     //链指到知识库的URI，只对命名实体有效。对于非命名实体和链接不到知识库的命名实体，此项为空串

        public String getFormal() {
            return formal;
        }

        public void setFormal(String formal) {
            this.formal = formal;
        }

        public List<LocDetail> getLoc_details() {
            return loc_details;
        }

        public void setLoc_details(List<LocDetail> loc_details) {
            this.loc_details = loc_details;
        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public String getPos() {
            return pos;
        }

        public void setPos(String pos) {
            this.pos = pos;
        }

        public String getNe() {
            return ne;
        }

        public void setNe(String ne) {
            this.ne = ne;
        }

        public List<String> getBasic_words() {
            return basic_words;
        }

        public void setBasic_words(List<String> basic_words) {
            this.basic_words = basic_words;
        }

        public int getByte_length() {
            return byte_length;
        }

        public void setByte_length(int byte_length) {
            this.byte_length = byte_length;
        }

        public int getByte_offset() {
            return byte_offset;
        }

        public void setByte_offset(int byte_offset) {
            this.byte_offset = byte_offset;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "formal='" + formal + '\'' +
                    ", loc_details=" + loc_details +
                    ", item='" + item + '\'' +
                    ", pos='" + pos + '\'' +
                    ", ne='" + ne + '\'' +
                    ", basic_words=" + basic_words +
                    ", byte_length=" + byte_length +
                    ", byte_offset=" + byte_offset +
                    ", uri='" + uri + '\'' +
                    '}';
        }
    }




    class LocDetail {
        private String type;            //成分类型，如省、市、区、县
        private int byte_offset;        //在item中的字节级offset（使用GBK编码）
        private int byte_length;        //字节级length（使用GBK编码）

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getByte_offset() {
            return byte_offset;
        }

        public void setByte_offset(int byte_offset) {
            this.byte_offset = byte_offset;
        }

        public int getByte_length() {
            return byte_length;
        }

        public void setByte_length(int byte_length) {
            this.byte_length = byte_length;
        }

        @Override
        public String toString() {
            return "LocDetail{" +
                    "type='" + type + '\'' +
                    ", byte_offset=" + byte_offset +
                    ", byte_length=" + byte_length +
                    '}';
        }
    }
}
