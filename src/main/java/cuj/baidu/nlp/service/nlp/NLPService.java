package cuj.baidu.nlp.service.nlp;

import cuj.baidu.nlp.domain.nlp.SentimentClassifyResponse;
import cuj.baidu.nlp.domain.nlp.LexicalResponse;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 13:28
 * @Description:
 */
public interface NLPService {
    /**
     * 词法分析接口
     * 向用户提供分词、词性标注、专名识别三大功能；能够识别出文本串中的基本词汇（分词），
     * 对这些词汇进行重组、标注组合后词汇的词性，并进一步识别出命名实体。
     * （定制版）词法分析接口：向用户提供分词、词性标注、专名识别三大功能；
     * 用户在控制台中进行个性化配置，支持自定义词表与规则，通过定制版可有效识别应用场景中的小众词汇与类别
     * @param text text
     * @return 词法分析结果
     */
    LexicalResponse lexicalAnalysis(String text);

    /**
     * 对话情绪识别接口
     * 针对用户日常沟通文本背后所蕴含情绪的一种直观检测，
     * 可自动识别出当前会话者所表现出的情绪类别及其置信度，
     * 可以帮助企业更全面地把握产品服务质量、监控客户服务质量
     * @param text text
     * @return 对话情绪识别结果
     */
    SentimentClassifyResponse sentimentClassify(String text);
}
