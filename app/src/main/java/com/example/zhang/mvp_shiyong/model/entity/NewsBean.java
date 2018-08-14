package com.example.zhang.mvp_shiyong.model.entity;
////////////////////////////////////////////////////////////////////                                                                   
//                          _ooOoo_                               //                                                                  
//                         o8888888o                              //                                                                  
//                         88" . "88                              //                                                                  
//                         (| ^_^ |)                              //                                                                  
//                         O\  =  /O                              //                                                                  
//                      ____/`---'\____                           //                                                                  
//                    .'  \\|     |//  `.                         //                                                                  
//                   /  \\|||  :  |||//  \                        //                                                                  
//                  /  _||||| -:- |||||-  \                       //                                                                  
//                  |   | \\\  -  /// |   |                       //                                                                  
//                  | \_|  ''\---/''  |   |                       //                                                                  
//                  \  .-\__  `-`  ___/-. /                       //                                                                  
//                ___`. .'  /--.--\  `. . ___                     //                                                                  
//              ."" '<  `.___\_<|>_/___.'  >'"".                  //                                                                  
//            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //                                                                  
//            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //                                                                  
//      ========`-.____`-.___\_____/___.-`____.-'========         //                                                                  
//                           `=---='                              //                                                                  
//      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //                                                                  
//                  佛祖保佑       永不宕机     永无BUG           //                                                                  
////////////////////////////////////////////////////////////////////    

import java.util.List;

/**
 * @author Zhang QQ:2914438742
 * @name mvp_shiyong
 * @class name：com.example.zhang.mvp_shiyong.model.entity
 * @time 2018/8/13 16:28
 */

public class NewsBean {


    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"4e42cbe1e3cfcea59e70d67a9da917d9","title":"\u201c仲夏夜之梦\u201d钢琴音乐会在江门演艺中心上演","date":"2018-08-13 10:36","category":"社会","author_name":"江门日报","url":"http://mini.eastday.com/mobile/180813103604733.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180813/20180813103604_041f69c8db3f51d57e808ce881be243e_1_mwpm_03200403.jpg"},{"uniquekey":"03c8225d6a36d3d45644ddd5b09e46c8","title":"中国第一巨人终于娶妻生子，妻子比他小28岁，生孩子困难重重","date":"2018-08-13 10:35","category":"社会","author_name":"十二星座天秤座吧","url":"http://mini.eastday.com/mobile/180813103559800.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180813/20180813103559_af19810b931905bf890bcac19396490e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180813/20180813103559_af19810b931905bf890bcac19396490e_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180813/20180813103559_af19810b931905bf890bcac19396490e_1_mwpm_03200403.jpg"},{"uniquekey":"1050fa49b8b128aa513cf617b6e6cb76","title":"女朋友想吵架的时候，从来不讲道理，该怎么办？","date":"2018-08-13 10:35","category":"社会","author_name":"偷懒的小猫大叔","url":"http://mini.eastday.com/mobile/180813103529552.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180813/20180813103529_a47e1ca2a9912b6671baa02993f1a228_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180813/20180813103529_a47e1ca2a9912b6671baa02993f1a228_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180813/20180813103529_a47e1ca2a9912b6671baa02993f1a228_5_mwpm_03200403.jpg"},{"uniquekey":"12edd70a1e33847543e2634c2c8bf8b5","title":"\u201c巧手奶奶\u201d叶素珍：爱上手工小制作 晚年生活乐趣多","date":"2018-08-13 10:35","category":"社会","author_name":"襄阳晚报","url":"http://mini.eastday.com/mobile/180813103519954.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180813/20180813103519_5249df6b7110f53a62577e5ceb83daad_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180813/20180813103519_5249df6b7110f53a62577e5ceb83daad_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180813/20180813103519_5249df6b7110f53a62577e5ceb83daad_1_mwpm_03200403.jpg"},{"uniquekey":"a2dc37befd8d153f47a213979028a417","title":"\u201c摩羯\u201d裹挟暴雨迎头撞上天文高潮位 嵊山枸杞出现短时内涝和人员被困","date":"2018-08-13 10:34","category":"社会","author_name":"舟山日报","url":"http://mini.eastday.com/mobile/180813103458541.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180813/20180813103458_1c6a813818f47c68c723e414a6c36ba3_1_mwpm_03200403.jpg"},{"uniquekey":"c06b84101580eeec55b4a36ca915ea64","title":"凯德龙之梦虹口会员日 线上与线下的会员专享体验","date":"2018-08-13 10:33","category":"社会","author_name":"中国经济导报网","url":"http://mini.eastday.com/mobile/180813103343325.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813103343_0ae1de2aefe2e1279d660808cc43b8f6_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180813/20180813103343_0ae1de2aefe2e1279d660808cc43b8f6_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180813/20180813103343_0ae1de2aefe2e1279d660808cc43b8f6_4_mwpm_03200403.jpg"},{"uniquekey":"e3e4acc74e616fa98effa0ac923cfdec","title":"能动英语： 激发兴趣，让孩子彻底爱上英语","date":"2018-08-13 10:33","category":"社会","author_name":"新华报业网","url":"http://mini.eastday.com/mobile/180813103340582.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180813/20180813103340_e80e5eca5ee6b628203e73f07e9bb6bf_1_mwpm_03200403.jpg"},{"uniquekey":"754d437f31f8450f745e289b9e38dd48","title":"东野圭吾作品重磅登录QQ阅读阅文集团版权引进再添新成果","date":"2018-08-13 10:33","category":"社会","author_name":"新华报业网","url":"http://mini.eastday.com/mobile/180813103340474.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180813/20180813103340_00392b63b4c84fd352b405cf9c37b48e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180813/20180813103340_00392b63b4c84fd352b405cf9c37b48e_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180813/20180813103340_00392b63b4c84fd352b405cf9c37b48e_3_mwpm_03200403.jpg"},{"uniquekey":"a3f1ae199138542eedc36ee47dc8f160","title":"患者私自离院欲出走 荆州这个车站人员暖心守护","date":"2018-08-13 10:32","category":"社会","author_name":"江汉商报","url":"http://mini.eastday.com/mobile/180813103247668.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180813/20180813103247_4d28630cf6ba0694647ce8b51f3fac90_1_mwpm_03200403.jpg"},{"uniquekey":"ab857b527737851498bc56e5c8507378","title":"黔灵山公园禁止轮椅车入园？ 园方回应：是误会","date":"2018-08-13 10:30","category":"社会","author_name":"贵州都市报","url":"http://mini.eastday.com/mobile/180813103044423.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813103044_d5309c7a5f4203a298c64254b656992e_1_mwpm_03200403.jpg"},{"uniquekey":"49d5339c95a6faa40bd4f4ec033f11bb","title":"惠城区提升金融服务实体经济发展能力 优化金融环境","date":"2018-08-13 10:30","category":"社会","author_name":"惠州日报","url":"http://mini.eastday.com/mobile/180813103020058.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180813/20180813103020_a8c09992c9b3e2c8ab6deddaad94f4ce_1_mwpm_03200403.jpg"},{"uniquekey":"00d8de9ea8cdc3f3813eebceec8abe20","title":"18岁患癌少女追星，被骗18万后吞安眠药自杀，网友：真疯狂！","date":"2018-08-13 10:30","category":"社会","author_name":"不只有八卦","url":"http://mini.eastday.com/mobile/180813103018298.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180813/20180813103018_1c48adca0b09c97f019bcc2c1860e317_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180813/20180813103018_1c48adca0b09c97f019bcc2c1860e317_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180813/20180813103018_1c48adca0b09c97f019bcc2c1860e317_4_mwpm_03200403.jpg"},{"uniquekey":"a82a80729ca8c905369b9b3b779214cd","title":"女子网购花七千元买了双假鞋, 要求店家3倍赔偿, 店家: 鞋子送你","date":"2018-08-13 10:29","category":"社会","author_name":"胜物联金融","url":"http://mini.eastday.com/mobile/180813102931601.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180813/20180813102931_531768dc4dca9784262ff382037dbb3c_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180813/20180813102931_531768dc4dca9784262ff382037dbb3c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180813/20180813102931_531768dc4dca9784262ff382037dbb3c_3_mwpm_03200403.jpg"},{"uniquekey":"b19330b65d5e16e45b54e07c7af2afbf","title":"女子因培训机构拒退学费爬4楼天台 双脚悬空","date":"2018-08-13 10:29","category":"社会","author_name":"钱江晚报","url":"http://mini.eastday.com/mobile/180813102929024.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180813/20180813102929_9b2af6bed776abe8d6cc258598dcc6e5_1_mwpm_03200403.jpg"},{"uniquekey":"71edca1b6751868e8b48bc6ed18badbd","title":"七个技巧钓哭黑坑老板","date":"2018-08-13 10:29","category":"社会","author_name":"全球钓鱼攻略","url":"http://mini.eastday.com/mobile/180813102922956.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813102922_06d4674a322360fe3b37daa1f7b9b7a6_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180813/20180813102922_06d4674a322360fe3b37daa1f7b9b7a6_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180813/20180813102922_06d4674a322360fe3b37daa1f7b9b7a6_2_mwpm_03200403.jpg"},{"uniquekey":"ffc23c176acfad56804b9b266f215d9e","title":"药店超范围经营遭曝光，广东再撤5张GSP证书！","date":"2018-08-13 10:28","category":"社会","author_name":"合规保证组织","url":"http://mini.eastday.com/mobile/180813102851099.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180813/20180813102851_787a8cdc332d0839777eb1c903c68fd5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180813/20180813102851_787a8cdc332d0839777eb1c903c68fd5_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180813/20180813102851_787a8cdc332d0839777eb1c903c68fd5_3_mwpm_03200403.jpg"},{"uniquekey":"cd378db118919a5b080fefe033e57518","title":"民盟连云港市委纪念改革开放四十周年书画展市美开展","date":"2018-08-13 10:28","category":"社会","author_name":"中国网","url":"http://mini.eastday.com/mobile/180813102830299.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180813/20180813102830_3d87469bfaf236308cacaac1612b7853_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180813/20180813102830_3d87469bfaf236308cacaac1612b7853_2_mwpm_03200403.jpg"},{"uniquekey":"ecf8dbb0726a0d121dd108e5ffb6c7b7","title":"43岁无业男谎称能介绍工作，将女孩锁车内强行发生性关系","date":"2018-08-13 10:28","category":"社会","author_name":"东方头条","url":"http://mini.eastday.com/mobile/180813102827056.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180813/20180813_d3db5b5c47cb49f8f5013cca395f8d44_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180813/20180813_5a20f3a3fc2d710f4a55adb302f31fec_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180813/20180813_59889816571da56248149efdf0668bb0_cover_mwpm_03200403.jpg"},{"uniquekey":"13892a0e34fd7de08064a5f507af3281","title":"\u201c永远的牧歌\u201d\u2014\u2014著名画家张广","date":"2018-08-13 10:28","category":"社会","author_name":"三友画社","url":"http://mini.eastday.com/mobile/180813102804877.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180813/20180813102804_07af583f920be26c2475b1412690e295_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180813/20180813102804_07af583f920be26c2475b1412690e295_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180813/20180813102804_07af583f920be26c2475b1412690e295_9_mwpm_03200403.jpg"},{"uniquekey":"ae95ee588a0efa452d5de91f687f14ac","title":"云南通海地震已致8人受伤 这张现场的照片刷屏网络","date":"2018-08-13 10:27","category":"社会","author_name":"重庆晨报","url":"http://mini.eastday.com/mobile/180813102745413.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813102745_e288280fa3ccff54f67708b6f2896368_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180813/20180813102745_e288280fa3ccff54f67708b6f2896368_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180813/20180813102745_e288280fa3ccff54f67708b6f2896368_2_mwpm_03200403.jpg"},{"uniquekey":"cec8f09bb91877b35f315b965f25b346","title":"新疆天翔航空学院应对大风天气筑牢安全运行防线","date":"2018-08-13 10:27","category":"社会","author_name":"中国民航网","url":"http://mini.eastday.com/mobile/180813102737083.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180813/20180813102737_2912ffbd79cb4e1c65ae39344c3a393c_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180813/20180813102737_2912ffbd79cb4e1c65ae39344c3a393c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180813/20180813102737_2912ffbd79cb4e1c65ae39344c3a393c_4_mwpm_03200403.jpg"},{"uniquekey":"25f8099fb3f74bfff14803742a891d50","title":"\"变态\"暴雨突袭 珠海机场有序应对确保旅客安全无忧","date":"2018-08-13 10:27","category":"社会","author_name":"中国民航网","url":"http://mini.eastday.com/mobile/180813102736524.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180813/20180813102736_6facee9bf56dbd3ed37d34d9e9ca99e7_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180813/20180813102736_6facee9bf56dbd3ed37d34d9e9ca99e7_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180813/20180813102736_6facee9bf56dbd3ed37d34d9e9ca99e7_6_mwpm_03200403.jpg"},{"uniquekey":"f2b664101dc4845dc7967d5e1348913b","title":"「乡村振兴」新农村建设如火如荼，昔日革命老区换新颜！","date":"2018-08-13 10:27","category":"社会","author_name":"怀集发布","url":"http://mini.eastday.com/mobile/180813102716857.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813102716_a9c9a7ee70427184f9c30c3cd4325be4_11_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180813/20180813102716_a9c9a7ee70427184f9c30c3cd4325be4_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180813/20180813102716_a9c9a7ee70427184f9c30c3cd4325be4_7_mwpm_03200403.jpg"},{"uniquekey":"ae940272f95cd054442668179ebb2c6e","title":"泰国夏秋季节洪水泛滥成灾","date":"2018-08-13 10:27","category":"社会","author_name":"中国台湾网","url":"http://mini.eastday.com/mobile/180813102714971.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180813/20180813102714_cfacb0200f56749bb1f5aa8ef997ed51_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180813/20180813102714_0cac114f4c12161952b2cdf2fbc9d560_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180813/20180813102714_41141ee4089e521578102c763c0b99ff_5_mwpm_03200403.jpg"},{"uniquekey":"c466a5985d2a197b7711e73545904c97","title":"三个最让外地人奔溃的城市，本地人都说方言，有一个太难懂","date":"2018-08-13 10:25","category":"社会","author_name":"旅游小视野","url":"http://mini.eastday.com/mobile/180813102546319.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180813/20180813102546_2eae53f2a057ae9e2bc7659104f34e8c_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180813/20180813102546_2eae53f2a057ae9e2bc7659104f34e8c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180813/20180813102546_2eae53f2a057ae9e2bc7659104f34e8c_5_mwpm_03200403.jpg"},{"uniquekey":"1ea175badbd844f29637663a8ea8395b","title":"山东青岛站主史洪云：不断提升自我 为福彩公益出力","date":"2018-08-13 10:25","category":"社会","author_name":"公益中华彩","url":"http://mini.eastday.com/mobile/180813102517621.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180813/20180813102517_0e38fdef53332834583223956e879128_1_mwpm_03200403.jpg"},{"uniquekey":"dd5aeb0af75d71ebd37fa1f1240173ba","title":"2018年8月云南地震还能去旅游吗 灾情怎么样","date":"2018-08-13 10:25","category":"社会","author_name":"趣味百晓僧","url":"http://mini.eastday.com/mobile/180813102504430.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180813/20180813102504_202fce37158a7f580e8842fd5b5f9960_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180813/20180813102504_202fce37158a7f580e8842fd5b5f9960_2_mwpm_03200403.jpg"},{"uniquekey":"4e15a0bd50207a4555462a53799d0ef0","title":"90后男子与妻子容留失足女 被抓时才知娇妻已50岁","date":"2018-08-13 10:24","category":"社会","author_name":"杀生丸","url":"http://mini.eastday.com/mobile/180813102453957.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813_6e886f1b3b3bbe744d9c3ca09136ea2c_cover_mwpm_03200403.jpg"},{"uniquekey":"f92d3fddac6c520361c5137c7a3969c1","title":"这样能治病，2岁孩子直接一屁股坐进汤锅中！","date":"2018-08-13 10:24","category":"社会","author_name":"菊花古剑和酒","url":"http://mini.eastday.com/mobile/180813102409144.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180813/20180813_a0556614bde7a09b50d62905c6123661_cover_mwpm_03200403.jpg"},{"uniquekey":"a739623eef42e83c46625051fae32144","title":"【一位摄影记者眼中的藏北变迁】（一）通往西藏的路","date":"2018-08-13 10:23","category":"社会","author_name":"中国西藏网","url":"http://mini.eastday.com/mobile/180813102304737.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180813/20180813102304_c3ffb00420579b95018d3c4974b245f2_11_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180813/20180813102304_c3ffb00420579b95018d3c4974b245f2_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180813/20180813102304_c3ffb00420579b95018d3c4974b245f2_5_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"4e42cbe1e3cfcea59e70d67a9da917d9","title":"\u201c仲夏夜之梦\u201d钢琴音乐会在江门演艺中心上演","date":"2018-08-13 10:36","category":"社会","author_name":"江门日报","url":"http://mini.eastday.com/mobile/180813103604733.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180813/20180813103604_041f69c8db3f51d57e808ce881be243e_1_mwpm_03200403.jpg"},{"uniquekey":"03c8225d6a36d3d45644ddd5b09e46c8","title":"中国第一巨人终于娶妻生子，妻子比他小28岁，生孩子困难重重","date":"2018-08-13 10:35","category":"社会","author_name":"十二星座天秤座吧","url":"http://mini.eastday.com/mobile/180813103559800.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180813/20180813103559_af19810b931905bf890bcac19396490e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180813/20180813103559_af19810b931905bf890bcac19396490e_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180813/20180813103559_af19810b931905bf890bcac19396490e_1_mwpm_03200403.jpg"},{"uniquekey":"1050fa49b8b128aa513cf617b6e6cb76","title":"女朋友想吵架的时候，从来不讲道理，该怎么办？","date":"2018-08-13 10:35","category":"社会","author_name":"偷懒的小猫大叔","url":"http://mini.eastday.com/mobile/180813103529552.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180813/20180813103529_a47e1ca2a9912b6671baa02993f1a228_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180813/20180813103529_a47e1ca2a9912b6671baa02993f1a228_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180813/20180813103529_a47e1ca2a9912b6671baa02993f1a228_5_mwpm_03200403.jpg"},{"uniquekey":"12edd70a1e33847543e2634c2c8bf8b5","title":"\u201c巧手奶奶\u201d叶素珍：爱上手工小制作 晚年生活乐趣多","date":"2018-08-13 10:35","category":"社会","author_name":"襄阳晚报","url":"http://mini.eastday.com/mobile/180813103519954.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180813/20180813103519_5249df6b7110f53a62577e5ceb83daad_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180813/20180813103519_5249df6b7110f53a62577e5ceb83daad_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180813/20180813103519_5249df6b7110f53a62577e5ceb83daad_1_mwpm_03200403.jpg"},{"uniquekey":"a2dc37befd8d153f47a213979028a417","title":"\u201c摩羯\u201d裹挟暴雨迎头撞上天文高潮位 嵊山枸杞出现短时内涝和人员被困","date":"2018-08-13 10:34","category":"社会","author_name":"舟山日报","url":"http://mini.eastday.com/mobile/180813103458541.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180813/20180813103458_1c6a813818f47c68c723e414a6c36ba3_1_mwpm_03200403.jpg"},{"uniquekey":"c06b84101580eeec55b4a36ca915ea64","title":"凯德龙之梦虹口会员日 线上与线下的会员专享体验","date":"2018-08-13 10:33","category":"社会","author_name":"中国经济导报网","url":"http://mini.eastday.com/mobile/180813103343325.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813103343_0ae1de2aefe2e1279d660808cc43b8f6_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180813/20180813103343_0ae1de2aefe2e1279d660808cc43b8f6_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180813/20180813103343_0ae1de2aefe2e1279d660808cc43b8f6_4_mwpm_03200403.jpg"},{"uniquekey":"e3e4acc74e616fa98effa0ac923cfdec","title":"能动英语： 激发兴趣，让孩子彻底爱上英语","date":"2018-08-13 10:33","category":"社会","author_name":"新华报业网","url":"http://mini.eastday.com/mobile/180813103340582.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180813/20180813103340_e80e5eca5ee6b628203e73f07e9bb6bf_1_mwpm_03200403.jpg"},{"uniquekey":"754d437f31f8450f745e289b9e38dd48","title":"东野圭吾作品重磅登录QQ阅读阅文集团版权引进再添新成果","date":"2018-08-13 10:33","category":"社会","author_name":"新华报业网","url":"http://mini.eastday.com/mobile/180813103340474.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180813/20180813103340_00392b63b4c84fd352b405cf9c37b48e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180813/20180813103340_00392b63b4c84fd352b405cf9c37b48e_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180813/20180813103340_00392b63b4c84fd352b405cf9c37b48e_3_mwpm_03200403.jpg"},{"uniquekey":"a3f1ae199138542eedc36ee47dc8f160","title":"患者私自离院欲出走 荆州这个车站人员暖心守护","date":"2018-08-13 10:32","category":"社会","author_name":"江汉商报","url":"http://mini.eastday.com/mobile/180813103247668.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180813/20180813103247_4d28630cf6ba0694647ce8b51f3fac90_1_mwpm_03200403.jpg"},{"uniquekey":"ab857b527737851498bc56e5c8507378","title":"黔灵山公园禁止轮椅车入园？ 园方回应：是误会","date":"2018-08-13 10:30","category":"社会","author_name":"贵州都市报","url":"http://mini.eastday.com/mobile/180813103044423.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813103044_d5309c7a5f4203a298c64254b656992e_1_mwpm_03200403.jpg"},{"uniquekey":"49d5339c95a6faa40bd4f4ec033f11bb","title":"惠城区提升金融服务实体经济发展能力 优化金融环境","date":"2018-08-13 10:30","category":"社会","author_name":"惠州日报","url":"http://mini.eastday.com/mobile/180813103020058.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180813/20180813103020_a8c09992c9b3e2c8ab6deddaad94f4ce_1_mwpm_03200403.jpg"},{"uniquekey":"00d8de9ea8cdc3f3813eebceec8abe20","title":"18岁患癌少女追星，被骗18万后吞安眠药自杀，网友：真疯狂！","date":"2018-08-13 10:30","category":"社会","author_name":"不只有八卦","url":"http://mini.eastday.com/mobile/180813103018298.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180813/20180813103018_1c48adca0b09c97f019bcc2c1860e317_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180813/20180813103018_1c48adca0b09c97f019bcc2c1860e317_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180813/20180813103018_1c48adca0b09c97f019bcc2c1860e317_4_mwpm_03200403.jpg"},{"uniquekey":"a82a80729ca8c905369b9b3b779214cd","title":"女子网购花七千元买了双假鞋, 要求店家3倍赔偿, 店家: 鞋子送你","date":"2018-08-13 10:29","category":"社会","author_name":"胜物联金融","url":"http://mini.eastday.com/mobile/180813102931601.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180813/20180813102931_531768dc4dca9784262ff382037dbb3c_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180813/20180813102931_531768dc4dca9784262ff382037dbb3c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180813/20180813102931_531768dc4dca9784262ff382037dbb3c_3_mwpm_03200403.jpg"},{"uniquekey":"b19330b65d5e16e45b54e07c7af2afbf","title":"女子因培训机构拒退学费爬4楼天台 双脚悬空","date":"2018-08-13 10:29","category":"社会","author_name":"钱江晚报","url":"http://mini.eastday.com/mobile/180813102929024.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180813/20180813102929_9b2af6bed776abe8d6cc258598dcc6e5_1_mwpm_03200403.jpg"},{"uniquekey":"71edca1b6751868e8b48bc6ed18badbd","title":"七个技巧钓哭黑坑老板","date":"2018-08-13 10:29","category":"社会","author_name":"全球钓鱼攻略","url":"http://mini.eastday.com/mobile/180813102922956.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813102922_06d4674a322360fe3b37daa1f7b9b7a6_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180813/20180813102922_06d4674a322360fe3b37daa1f7b9b7a6_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180813/20180813102922_06d4674a322360fe3b37daa1f7b9b7a6_2_mwpm_03200403.jpg"},{"uniquekey":"ffc23c176acfad56804b9b266f215d9e","title":"药店超范围经营遭曝光，广东再撤5张GSP证书！","date":"2018-08-13 10:28","category":"社会","author_name":"合规保证组织","url":"http://mini.eastday.com/mobile/180813102851099.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180813/20180813102851_787a8cdc332d0839777eb1c903c68fd5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180813/20180813102851_787a8cdc332d0839777eb1c903c68fd5_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180813/20180813102851_787a8cdc332d0839777eb1c903c68fd5_3_mwpm_03200403.jpg"},{"uniquekey":"cd378db118919a5b080fefe033e57518","title":"民盟连云港市委纪念改革开放四十周年书画展市美开展","date":"2018-08-13 10:28","category":"社会","author_name":"中国网","url":"http://mini.eastday.com/mobile/180813102830299.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180813/20180813102830_3d87469bfaf236308cacaac1612b7853_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180813/20180813102830_3d87469bfaf236308cacaac1612b7853_2_mwpm_03200403.jpg"},{"uniquekey":"ecf8dbb0726a0d121dd108e5ffb6c7b7","title":"43岁无业男谎称能介绍工作，将女孩锁车内强行发生性关系","date":"2018-08-13 10:28","category":"社会","author_name":"东方头条","url":"http://mini.eastday.com/mobile/180813102827056.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180813/20180813_d3db5b5c47cb49f8f5013cca395f8d44_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180813/20180813_5a20f3a3fc2d710f4a55adb302f31fec_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180813/20180813_59889816571da56248149efdf0668bb0_cover_mwpm_03200403.jpg"},{"uniquekey":"13892a0e34fd7de08064a5f507af3281","title":"\u201c永远的牧歌\u201d\u2014\u2014著名画家张广","date":"2018-08-13 10:28","category":"社会","author_name":"三友画社","url":"http://mini.eastday.com/mobile/180813102804877.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180813/20180813102804_07af583f920be26c2475b1412690e295_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180813/20180813102804_07af583f920be26c2475b1412690e295_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180813/20180813102804_07af583f920be26c2475b1412690e295_9_mwpm_03200403.jpg"},{"uniquekey":"ae95ee588a0efa452d5de91f687f14ac","title":"云南通海地震已致8人受伤 这张现场的照片刷屏网络","date":"2018-08-13 10:27","category":"社会","author_name":"重庆晨报","url":"http://mini.eastday.com/mobile/180813102745413.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813102745_e288280fa3ccff54f67708b6f2896368_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180813/20180813102745_e288280fa3ccff54f67708b6f2896368_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180813/20180813102745_e288280fa3ccff54f67708b6f2896368_2_mwpm_03200403.jpg"},{"uniquekey":"cec8f09bb91877b35f315b965f25b346","title":"新疆天翔航空学院应对大风天气筑牢安全运行防线","date":"2018-08-13 10:27","category":"社会","author_name":"中国民航网","url":"http://mini.eastday.com/mobile/180813102737083.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180813/20180813102737_2912ffbd79cb4e1c65ae39344c3a393c_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180813/20180813102737_2912ffbd79cb4e1c65ae39344c3a393c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180813/20180813102737_2912ffbd79cb4e1c65ae39344c3a393c_4_mwpm_03200403.jpg"},{"uniquekey":"25f8099fb3f74bfff14803742a891d50","title":"\"变态\"暴雨突袭 珠海机场有序应对确保旅客安全无忧","date":"2018-08-13 10:27","category":"社会","author_name":"中国民航网","url":"http://mini.eastday.com/mobile/180813102736524.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180813/20180813102736_6facee9bf56dbd3ed37d34d9e9ca99e7_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180813/20180813102736_6facee9bf56dbd3ed37d34d9e9ca99e7_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180813/20180813102736_6facee9bf56dbd3ed37d34d9e9ca99e7_6_mwpm_03200403.jpg"},{"uniquekey":"f2b664101dc4845dc7967d5e1348913b","title":"「乡村振兴」新农村建设如火如荼，昔日革命老区换新颜！","date":"2018-08-13 10:27","category":"社会","author_name":"怀集发布","url":"http://mini.eastday.com/mobile/180813102716857.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813102716_a9c9a7ee70427184f9c30c3cd4325be4_11_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180813/20180813102716_a9c9a7ee70427184f9c30c3cd4325be4_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180813/20180813102716_a9c9a7ee70427184f9c30c3cd4325be4_7_mwpm_03200403.jpg"},{"uniquekey":"ae940272f95cd054442668179ebb2c6e","title":"泰国夏秋季节洪水泛滥成灾","date":"2018-08-13 10:27","category":"社会","author_name":"中国台湾网","url":"http://mini.eastday.com/mobile/180813102714971.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180813/20180813102714_cfacb0200f56749bb1f5aa8ef997ed51_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180813/20180813102714_0cac114f4c12161952b2cdf2fbc9d560_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180813/20180813102714_41141ee4089e521578102c763c0b99ff_5_mwpm_03200403.jpg"},{"uniquekey":"c466a5985d2a197b7711e73545904c97","title":"三个最让外地人奔溃的城市，本地人都说方言，有一个太难懂","date":"2018-08-13 10:25","category":"社会","author_name":"旅游小视野","url":"http://mini.eastday.com/mobile/180813102546319.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180813/20180813102546_2eae53f2a057ae9e2bc7659104f34e8c_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180813/20180813102546_2eae53f2a057ae9e2bc7659104f34e8c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180813/20180813102546_2eae53f2a057ae9e2bc7659104f34e8c_5_mwpm_03200403.jpg"},{"uniquekey":"1ea175badbd844f29637663a8ea8395b","title":"山东青岛站主史洪云：不断提升自我 为福彩公益出力","date":"2018-08-13 10:25","category":"社会","author_name":"公益中华彩","url":"http://mini.eastday.com/mobile/180813102517621.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180813/20180813102517_0e38fdef53332834583223956e879128_1_mwpm_03200403.jpg"},{"uniquekey":"dd5aeb0af75d71ebd37fa1f1240173ba","title":"2018年8月云南地震还能去旅游吗 灾情怎么样","date":"2018-08-13 10:25","category":"社会","author_name":"趣味百晓僧","url":"http://mini.eastday.com/mobile/180813102504430.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180813/20180813102504_202fce37158a7f580e8842fd5b5f9960_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180813/20180813102504_202fce37158a7f580e8842fd5b5f9960_2_mwpm_03200403.jpg"},{"uniquekey":"4e15a0bd50207a4555462a53799d0ef0","title":"90后男子与妻子容留失足女 被抓时才知娇妻已50岁","date":"2018-08-13 10:24","category":"社会","author_name":"杀生丸","url":"http://mini.eastday.com/mobile/180813102453957.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180813/20180813_6e886f1b3b3bbe744d9c3ca09136ea2c_cover_mwpm_03200403.jpg"},{"uniquekey":"f92d3fddac6c520361c5137c7a3969c1","title":"这样能治病，2岁孩子直接一屁股坐进汤锅中！","date":"2018-08-13 10:24","category":"社会","author_name":"菊花古剑和酒","url":"http://mini.eastday.com/mobile/180813102409144.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180813/20180813_a0556614bde7a09b50d62905c6123661_cover_mwpm_03200403.jpg"},{"uniquekey":"a739623eef42e83c46625051fae32144","title":"【一位摄影记者眼中的藏北变迁】（一）通往西藏的路","date":"2018-08-13 10:23","category":"社会","author_name":"中国西藏网","url":"http://mini.eastday.com/mobile/180813102304737.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180813/20180813102304_c3ffb00420579b95018d3c4974b245f2_11_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180813/20180813102304_c3ffb00420579b95018d3c4974b245f2_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180813/20180813102304_c3ffb00420579b95018d3c4974b245f2_5_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 4e42cbe1e3cfcea59e70d67a9da917d9
             * title : “仲夏夜之梦”钢琴音乐会在江门演艺中心上演
             * date : 2018-08-13 10:36
             * category : 社会
             * author_name : 江门日报
             * url : http://mini.eastday.com/mobile/180813103604733.html
             * thumbnail_pic_s : http://05.imgmini.eastday.com/mobile/20180813/20180813103604_041f69c8db3f51d57e808ce881be243e_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://06.imgmini.eastday.com/mobile/20180813/20180813103559_af19810b931905bf890bcac19396490e_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://06.imgmini.eastday.com/mobile/20180813/20180813103559_af19810b931905bf890bcac19396490e_1_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }

}
