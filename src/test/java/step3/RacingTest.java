package step3;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import step3.domain.Racing;

public class RacingTest {
	@DisplayName("레이싱 동작 테스트")
	@CsvSource(value = {"3:5", "2:4", "5:5"}, delimiter = ':')
	@ParameterizedTest
	void race(int numberOfTrials, int numberOfCars) {
		Racing racing = new Racing(numberOfTrials, numberOfCars);
		int[][] result = racing.race();

		int resultTrials = result.length;
		int resultCars = result[0].length;

		assertThat(resultTrials).isEqualTo(numberOfTrials);
		assertThat(resultCars).isEqualTo(numberOfCars);
	}
}
