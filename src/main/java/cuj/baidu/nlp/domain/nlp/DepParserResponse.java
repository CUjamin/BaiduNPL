package cuj.baidu.nlp.domain.nlp;

import java.util.List;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 16:46
 * @Description:
 *
 *
 * {
"log_id": 12345,
"text":"今天天气怎么样",
"items":[
{
"id":"1", //id
"word":"今天", //word
"postag":"t", //POS tag
"head":"2", //id of current word's parent
"deprel":"ATT"  //depend relations between current word and parent
},
{
"id":"2",
"word":"天气",
"postag":"n",
"head":"3",
"deprel":"SBV",
},
{
"id":"3",
"word":"怎么样",
"postag":"r",
"head":"0",
"deprel":"HED",
}
]
}
 *
 */
public class DepParserResponse extends NlpResponse{
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "DepParserResponse{" +
                "items=" + items +
                ", log_id='" + log_id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    /**
     {
     "id":"3",
     "word":"怎么样",
     "postag":"r",
     "head":"0",
     "deprel":"HED",
     }
     */
    class Item{
        private int id;
        private String word;
        private String postag;
        private int head;
        private String deprel;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String getPostag() {
            return postag;
        }

        public void setPostag(String postag) {
            this.postag = postag;
        }

        public int getHead() {
            return head;
        }

        public void setHead(int head) {
            this.head = head;
        }

        public String getDeprel() {
            return deprel;
        }

        public void setDeprel(String deprel) {
            this.deprel = deprel;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "id='" + id + '\'' +
                    ", word='" + word + '\'' +
                    ", postag='" + postag + '\'' +
                    ", head='" + head + '\'' +
                    ", deprel='" + deprel + '\'' +
                    '}';
        }
    }
}
