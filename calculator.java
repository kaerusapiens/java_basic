/*-< 演習：Ex1_15_1 >---------------------------------
BigDecimalの扱いについてAPIドキュメントなどで調べながら
以下の結果が表示されるプログラムを作ってみましょう！
----------------------------------------------------*/
import java.math.BigDecimal;
import java.math.RoundingMode;

class calculator{
	public static void main (String[] args) {
		
		//(1) 0.2 * 83 - 10.6
		BigDecimal a = new BigDecimal("0.2");
        BigDecimal b = new BigDecimal("83");
        BigDecimal c = new BigDecimal("10.6");
        BigDecimal result = a.multiply(b).subtract(c);
		
		System.out.println(result);
		
		
		
		//(2) 0.2 * 83 - 10.6 / 3　※小数第4位までで表示（小数第5位以下は四捨五入）
		//<補足>
		// BigDecimalによる割り算は丸めの指定が必要です！
		// XXX ÷ YYYをして小数第2位で表示（小数第3位以下は切り捨て）
		// XXX.divide(YYY, 2, RoundingMode.DOWN);
		
        BigDecimal d = new BigDecimal("3");
        BigDecimal second_result = a.multiply(b).subtract(c).divide(d,2,RoundingMode.DOWN);
        System.out.println(second_result);
		
		
		
		
		
		
	}
}
