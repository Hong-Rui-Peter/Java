public class Ccar {                    //汽車類別
    public double gas, tbo;            //宣告最多載油量, 平均耗油量
	public double max_dist = 0;        //加滿油可行駛最長距離

	public void MaxDist() {             //計算可行駛最長距離
	    max_dist = gas * tbo;
	}

	public double Dist(double oil) {   //一般加油可行駛距離
	    return oil * tbo;
	}
}