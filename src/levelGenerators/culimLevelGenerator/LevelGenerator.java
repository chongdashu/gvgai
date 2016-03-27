package levelGenerators.culimLevelGenerator;

import tools.ElapsedCpuTimer;
import core.game.GameDescription;
import core.generator.AbstractLevelGenerator;

public class LevelGenerator extends AbstractLevelGenerator{

	/**
	 * Constructor for the CulimLevelGenerator
	 * @param game			Abstract game description object. This object contains all needed information about the current game.
	 * @param elapsedTimer	Timer to define the maximum amount of time for the constructor.
	 */
	public LevelGenerator(GameDescription game, ElapsedCpuTimer elapsedTimer){
	}
	
	/**
	 * Generate a level 
	 * @param game			Abstract game description object. This object contains all needed information about the current game.
	 * @param elapsedTimer	Timer to define the maximum amount of time for the level generation.
	 */
	@Override
	public String generateLevel(GameDescription game, ElapsedCpuTimer elapsedTimer) {
		String result = "";
		
		return result;
	}
}
