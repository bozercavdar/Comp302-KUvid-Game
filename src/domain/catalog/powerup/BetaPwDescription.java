package domain.catalog.powerup;

import domain.factories.ObjectType;
import domain.hitbox.Point;
import domain.kuvidgame.KuVidGame;
import domain.objects.path.Path;
import domain.objects.path.StraightLinePath;

public class BetaPwDescription extends PowerupDescription {
	
	public BetaPwDescription() {
		super();
		super.setPowType(ObjectType.BETA_POW);
		super.setDiameter(KuVidGame.getL()*2/4);
		this.setImageDirectory("images/betaPw.png");
	}


	@Override
	public Path getPowerupFallPath(Point currentPosition) {
		int wH = KuVidGame.getInstance().getWindowHeight();
		double step = 40*(wH - currentPosition.getY())/KuVidGame.getL();
		
		return new StraightLinePath(currentPosition.getX(), currentPosition.getY(), currentPosition.getX(), wH, (int) step);
	}
	
	@Override
	public boolean isMatch(ObjectType rbType) {
		// TODO Auto-generated method stub
		return rbType== ObjectType.BETA_RB;
	}
	
}
