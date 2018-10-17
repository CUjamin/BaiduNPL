package cuj.baidu.nlp.domain.nlp;

import java.util.List;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 14:59
 * @Description:
 *
 *
 * {
"log_id": 8972314753435316241,
"text": "今天不高兴",
"items": [{
"positive_prob": 0.410404,
"sentiment": 0,
"confidence": 0.0879908,
"negative_prob": 0.589596
}]
}
 */
public class SentimentClassifyResponse extends NlpResponse{
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "SentimentClassifyResponse{" +
                "items=" + items +
                ", log_id='" + log_id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    class Item{
        private double positive_prob;
        private double negative_prob;
        private double sentiment;
        private double confidence;

        public double getPositive_prob() {
            return positive_prob;
        }

        public void setPositive_prob(double positive_prob) {
            this.positive_prob = positive_prob;
        }

        public double getNegative_prob() {
            return negative_prob;
        }

        public void setNegative_prob(double negative_prob) {
            this.negative_prob = negative_prob;
        }

        public double getSentiment() {
            return sentiment;
        }

        public void setSentiment(double sentiment) {
            this.sentiment = sentiment;
        }

        public double getConfidence() {
            return confidence;
        }

        public void setConfidence(double confidence) {
            this.confidence = confidence;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "positive_prob=" + positive_prob +
                    ", negative_prob=" + negative_prob +
                    ", sentiment=" + sentiment +
                    ", confidence=" + confidence +
                    '}';
        }
    }
}

