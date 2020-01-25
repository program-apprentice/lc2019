package com.programapprentice.app.hard;

import org.junit.Test;

import java.util.List;

public class PalindromePairs336_T {
  PalindromePairs336 solution = new PalindromePairs336();

  @Test
  public void test1() {
    String[] words = {"abcd","dcba","lls","s","sssll"};
    List<List<Integer>> result = solution.palindromePairs(words);
    for(List<Integer> item : result) {
      System.out.println(String.format("%d %d", item.get(0), item.get(1)));
    }
  }

  @Test
  public void test2() {
    String[] words = {"bat", "tab", "cat"};
    List<List<Integer>> result = solution.palindromePairs(words);
    for(List<Integer> item : result) {
      System.out.println(String.format("%d %d", item.get(0), item.get(1)));
    }
  }

  @Test
  public void test3() {
    String[] words = {"a", ""};
    List<List<Integer>> result = solution.palindromePairs(words);
    for(List<Integer> item : result) {
      System.out.println(String.format("%d %d", item.get(0), item.get(1)));
    }
  }

  @Test
  public void test4() {
    String[] words = {"igbegc","bjaie","gbjjbjejhfjdcihafbb","fdicacaabeffbef","hcceddbahj","hagfdecbabfgejf","djbggdjecdjgbgiag","ajbbhddabhbdgifhda","hhcd","hahhe","ijcjgbfd","ifbffgdjc","eaifbciaahhhj","ebgcfcdeh","hjigih","bgcfiiijhebaajihej","hjeffjgdcjgcbdddijeh","icdjccafeeafhjgfdid","djccehfjabefhje","iahhbjdbfiga","digfjfbfeiacja","dedahibjcgbjichdahe","adfcjhcbcfhcchbijbc","hacbaejcgd","gdciig","gdhegibiff","ha","giehaa","cdejcj","edeijdaeijccahi","bhh","ecbghbfebeaedeg","jbjbachjfefhdeg","fjcfjiejfahdhdhi","gjf","h","c","ahbgfgfcagibfeg","iahchdcebhchegfhdc","g","hcagij","bdaaabeaehddg","gicgg","bd","hj","hcfgcdjeei","ejhbbhaeh","hhecadhbficejibed","bfjbd","hfiefj","ebdedfafgaicccf","cideccfdc","jijfdgjfbcgaagg","egdehbiddebdfia","gceebaghfeajahgea","dccjhfhdagbfijhhaaj","ja","jfhabfddged","aejghccif","cbfadecbhbbhcachfj","cihajjd","ebegciaeifggbgdei","hhi","dgicdiih","afhafbh","defjhdcgcfhfffdahf","ajibedigdgggaciefadc","bfjdcfchdafehgfdjih","dg","eabaaggd","icdjdcddfbj","cciibdcecgfeeedd","jbjbgiddhbh","f","dgdbhh","jchbbc","ffihghaifi","bhiijgaeciehjd","dhjijacgefdacb","j","aajhicgbjhcajeihgc","jj","bjjhcfighb","jddiajedebbjejghdg","bjgbgjgfghcchcccjfj","aaeeebgjhff","efcjjcfh","jhgebbhijijb","ieaijdfebbahhdf","fajfggbcfagadcaii","ffaee","hfbhhaffdbcibgh","hehbdbcfhhfijjeeec","ghffea","icfgbedbgii","cgfeggjfchdbbj","aa","acdbgfegbgg","ifcfiehiigjbg","fe","ahjcaebchiii","hffjfadaggdbcjef","jfihifhhfidcbidj","hhacjagiaaie","gbdccjgdbgifcddbe","jhhcijg","bbbdagddgie","ahjhig","gadjidbfciajf","bcafebgcbecbehed","gaajjigijh","ghbgebcgji","icihcicacjhbeeh","fedbfccdbaece","bjbjfdiaffifjg","daaehijidjfbfdjdaijh","ibe","hbbheegcbabadeafeiec","fgacaebbfga","gdcaibajbeaidhbcjgjb","gddd","hfgibbia","fheiddaaghjeaiee","jaeejd","id","jfdaa","eafdfaeecdidgjdjca","jdbbjdecbccb","dcchiediacebfeh","gigfbihajgheahjfge","cchdbdaecfbfahhfbdgh","ggjijfji","eedfah","eghjdah","ghbjifjecec","fehhifdac","hfji","ic","eiahjijj","higgdjdfjhedahbgcih","djihibaehhec","gecaej","bcgcd","ajheijacjhbfjhcgj","dcficejhiegafagh","igfcjchhaicjggjcd","e","jficddcjjficdhhcfa","ffeccfbab","jdjhgicffjejajghfcg","ficafe","ghbcjdhi","gdegbcffbahdadbjaacg","hfig","geedc","hhedhfeajgjadh","ahabfjahhcchhff","jeggccfiacghb","jajhabhdededaacg","b","gjigjcdaccjfgeadebag","hgigaddhgi","hagbeg","caebdfdifieajbcd","fdajifjb","je","abeaa","bbbfhddga","chficghddf","a","cjeejaihdijb","che","dfcbhdjb","jicb","ghbaccb","cecedafbafdafaicadd","dicebheac","hjhefdeafgadde","ebghcaijhgd","babaaefg","aeif","hdjdjh","gihdaccbeiciajdd","cibjfgehhfdccajie","jefifgcfdheccagbfca","jgjaghh","ijhgdgjjee","hbcffdcdiabbc","febgjh","jiagdcgjfaecace","agaadhi","cadafcfgiicdgfi","eccbegbabjjhcdj","gjeggeedjjgbjbfibc","bdhgfbfaaeifi","eaedd","jddaeihhgh","ie","egfi","gicjfhaghicbicaa","bfdga","dfhfhceahibhjice","fci","ecbchgedjgjaiibfeggh","i","ijicfhijdbejfhfbie","bcejbaghhjagfdcfifcc","he","cbhbghiaadeejbbbhhig","ffgbibagbaggiccbhfe","eefadjehcibjbhijj","jabbfghjibhejchigeb","bcigaeeeaeg","jhgebcdigedaeacj","eahdfddfedbhdbbaf","dbdfba","ejddceejc","fcghcjfe","fibedbcedecbe","eaggaicjbjffbccgah","efbfccgciecggcff","ccg","ibjeffffhiifhj","ig","bg","ggche","eiejgedfhi","eagcgdagggabhdbhgeia","ijgdib","eajhbcafggicicd","cifcajcbdaggdhdiggf","hbdjcffeecb","gdccjjcha","hh","eaibebefh","bbhcjbieejhghcjiaaj","jbgei","eifidafibhbfg","igfgjjbigceib","hcdjgbe","ijg","aibedcgfcffhccfcffc","cfhdgjdiceaiagb","ebaibegah","gdcaeaha","daddaacifbfhfff","ggbiaghihhejedcheifc","fbacadegghhjjch","eajdedifbe","hbheeiigafdjdgcijjc","ab","bdjgejbaeaadbjcbfjj","cjhifecbha","dbjcdcaj","bgabgcjhaiga","bdhebbcgbcd","gdfjhh","eegadahedbjbgdfbhhff","cjhdc","iaabjig","gfjcfgdifgbgg","ciadc","djdijdhfjjchgbaef","abaigbdfjf","jiggiieeicfcdjieadc","gdfeidijdica","gihgdge","gdhhacbc","iige","ichadfcfifcihggbge","ijebajebgbhgdcahjhgi","iibif","bjibaigggbjajgfbaec","dajggdhedgdf","cibacedeac","d","dagffjffjdfgg","ghjdjjahf","abagicjaahciaeigfa","ifja","jdfdefde","haghdbjfdghjebjaege","eabbdeefegaaebca","fhdfgccjdef","fgdifeji","ghhceafhicdih","aabdafgfgijfa","ffiadfebgdbifgfd","afiidihdcbgieibddbdf","fha","igagbidecbfejeijea","hbiaai","aigifga","jbbb","chdabjdciddjdgj","dgddajiegeijdee","dhijdbgg","hhadfjegbchhgbajiaag","bfeea","ccceabgijeiebdhaaghj","jiig","ibacdcjaiigfaaei","fafbhcdgc","cbf","bjiieidhbgad","egdeahbafaci","jdcdicc","bghgihgjaie","jfif","jjea","ejfaicf","adhb","gegeahgcgbbfehgjgj","beabdahfaebdachheh","cffaejacafd","aibhbdjih","jgcbihdihejiachfhj","jjdgicbeah","ghchaiigcgjejejfg","chhhbaefgfbeadfei","efjhjhcbj","gjgaebjfjbghai","ibecebcgdahdcb","bjecgejahjfghdfjcb","fgfjfah","gigejjjcbaehhfheh","deejfebfgedfgjdjgi","ia","cjjfjigead","agdcfjah","jfhgbfjggcaibdj","gdbibaaaidgaijjf","abdbdachghe","hgiejifcgec","cjheifcgjd","iigbeijcbhfa","fbbcij","aigfbfcjgci","ijhhffjfbhcdgjgb","hiiichajchdfdc"};
    List<List<Integer>> result = solution.palindromePairs(words);
    for(List<Integer> item : result) {
      System.out.println(String.format("%d %d", item.get(0), item.get(1)));
    }
  }
}
