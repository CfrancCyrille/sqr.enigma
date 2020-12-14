package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Main;

public class MachineTest {
	
	String config ="* B III IV I AXLE";
	String msg1 = "FROM his shoulder Hiawatha";
	String code1 = "HYIHBSBOEBTWJZSXMWQKYGWSFR";
	String msg2 = "HYIHLBKOMLIUYDCMPPSFSZW";
	String code2 = "FROMHISSHOULDERHIAWATHA";
	
	@Test
	/**
	 * This is more a validation tests, than an unit test
	 */
	public void convert_Msg1_code1() {
		Machine m = new Machine();
		Main.configure(m, config);
		String expected = code1;
		String actual = m.convert(msg1);
		assertEquals(expected, actual);
	}

	@Test
	/**
	 * This is more a validation tests, than an unit test
	 */
	public void unconvert_Msg2_code2() {
		Machine m = new Machine();
		Main.configure(m, config);
		String expected = code2;
		String actual = m.convert(msg2);
		assertEquals(expected, actual);
	}

	@Test
	public void setPositions_test(){
		Machine m = new Machine();
		Main.configure(m, config);
		m.setPositions("AXLE");
		String expected = code2;
		String actual = m.convert(msg2);
		assertEquals(expected, actual);

	}

	@Test
	public void advanceRotors(){
		Machine m = new Machine();
		Main.configure(m, config);
		String expected = code1;
		m.advanceRotors();
		String actual = m.convert(msg1);
		assertNotEquals(expected, actual);
	}
}
