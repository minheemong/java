package days16;
interface Repairable{
	
}
class Unit{
	int hp; // 현재 체력
	int max_hp; // 최대 체력;
	Unit(int p) {
		max_hp = p; //super() 로 호출되고 전달될 체력을 max_hp에 저장
		hp = (int)(p*0.8);
	} 
	public void prnHP() {
		System.out.println("최대 체력 : "+max_hp+", 현재 체력 : "+hp);
	}
}

class GroundUnit extends Unit{
	GroundUnit(int p) {
		super(p);
	}
}
class AirUnit extends Unit{
	AirUnit(int p) {
		super(p);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank() {super(150);}
	public String toString() {return "Tank";}
}
class Dropship extends AirUnit implements Repairable{
	Dropship() {super(150);}
	public String toString() {return "Dropship";}
}
class Marine extends GroundUnit{
	Marine() {super(40);}
	public String toString() {return "Marine";}
}
class SCV extends GroundUnit implements Repairable{
	SCV() {super(40);}
	public String toString() {return "SCV";}
	//public void repair(Tank tank1) {	}
	//public void repair(Dropship dropship1) {	}
	//public void repair(SCV scv2) {	}
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			if(u.hp!=u.max_hp)
				System.out.println(u+"의 수리를 시작합니다");
			else {
				System.out.println(u+"의 hp는 만땅입니다\n");
				return;
			}
			while(u.hp!=u.max_hp) {
				u.hp+=2;
				System.out.println("체력 2를 repair했습니다. 현재체력 : "+u.hp);
			}
			System.out.println(u+"의 수리가 끝났습니다\n");
		}
	}
}
public class Extends12_Interface04 {

	public static void main(String[] args) {
		Tank tank1 = new Tank();
		Dropship dropship1 = new Dropship();
		Marine marine1 = new Marine();
		SCV scv1 = new SCV();
		SCV scv2 = new SCV();
		System.out.printf("%s : ",tank1.toString());
		tank1.prnHP();
		System.out.printf("%s : ",dropship1.toString());
		dropship1.prnHP();
		System.out.printf("%s : ",marine1.toString());
		marine1.prnHP();
		System.out.printf("%s : ",scv2.toString());
		scv2.prnHP();
		
		scv1.repair(tank1);
		scv1.repair(dropship1);
		scv1.repair(scv2);
		//scv1.repair(marine1); //에러
		
		System.out.printf("%s : ",tank1.toString());
		tank1.prnHP();
		System.out.printf("%s : ",dropship1.toString());
		dropship1.prnHP();
		System.out.printf("%s : ",marine1.toString());
		marine1.prnHP();
		System.out.printf("%s : ",scv2.toString());
		scv2.prnHP();
	}

}
