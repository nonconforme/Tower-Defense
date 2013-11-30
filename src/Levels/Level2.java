package Levels;

import java.util.ArrayList;

import android.graphics.Path;
import android.graphics.Path.Direction;

import com.example.towerdefense.AbsEnemy;
import com.example.towerdefense.EnemyCircle;
import com.example.towerdefense.TankEnemy;
import com.example.towerdefense.TowerGameLogic;

public class Level2 extends AbsLevel{
	
	private static final int gold = 1000;

	public Level2(TowerGameLogic m, int cellheight, int cellwidth) {
		super(m, cellheight, cellwidth);
		inst.add(new int[] {0,(cw * 3) + halfcw, 1});
		inst.add(new int[] {1,(ch * 5) + halfch, 1});
		inst.add(new int[] {0,(cw * 8) + halfcw, 1});
		inst.add(new int[] {1,(ch * 3) + halfch, -1});
		inst.add(new int[] {0,(cw * 13) + halfcw, 1});
		
		m.setPath(path);
		
		mGame.setInst(inst);  
		ArrayList<AbsEnemy> wave1 = new ArrayList<AbsEnemy>();
		wave1.add(new EnemyCircle(0, (3*ch+halfch), halfch, inst, m));
		wave1.add(new EnemyCircle(0, (3*ch+halfch), halfch, inst, m));
		wave1.add(new EnemyCircle(0, (3*ch+halfch), halfch, inst, m));
		wave1.add(new EnemyCircle(0, (3*ch+halfch), halfch, inst, m));
		wave1.add(new EnemyCircle(0, (3*ch+halfch), halfch, inst, m));
		wave1.add(new EnemyCircle(0, (3*ch+halfch), halfch, inst, m));
		wave1.add(new EnemyCircle(0, (3*ch+halfch), halfch, inst, m));
		wave1.add(new EnemyCircle(0, (3*ch+halfch), halfch, inst, m));
		wave1.add(new EnemyCircle(0, (3*ch+halfch), halfch, inst, m));
		wave1.add(new TankEnemy(0, (3*ch+halfch), halfch, inst, m));
		enemies.add(wave1);
	}

	@Override
	public void makepath() {
		addpath(4,0);
		addpath(4,1);
		addpath(3,1);
		addpath(2,1);
		addpath(2,2);
		addpath(2,3);
		addpath(2,4);
		addpath(2,5);
		addpath(3,5);
		addpath(4,5);
		addpath(5,5);
		addpath(6,5);
		addpath(7,5);
		addpath(7,6);
		addpath(7,7);
		addpath(7,8);
		addpath(6,8);
		addpath(5,8);
		addpath(4,8);
		addpath(3,8);
		addpath(2,8);
		addpath(2,9);
		addpath(2,10);
		addpath(2,11);
		addpath(2,12);
		addpath(2,13);
		
	}

	@Override
	public int getGold() {
		// TODO Auto-generated method stub
		return gold;
	}

}
