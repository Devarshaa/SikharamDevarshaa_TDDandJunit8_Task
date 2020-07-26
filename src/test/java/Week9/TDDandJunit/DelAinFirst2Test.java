package Week9.TDDandJunit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DelAinFirst2Test {
	/*TODO list
	 * 1. 1A :ABC => BC
	 * 2. 2A :AABCB => BCB
	 * 3. nA :AAABAA => AbAA
	 * 4. only 1 A :A => ""
	 * 5. only 2 As :AA => ""
	 * 6. only n As : AAAA=> AA
	 * 7. no As : BCD => BCD
	 */

	@Test
	void test1A() {
		DelAinFirst2 obj = new DelAinFirst2();
		String res = obj.del("ABC");
		assertEquals("BC",res);
	}
	@Test
	void test2A() {
		DelAinFirst2 obj = new DelAinFirst2();
		String res = obj.del("AABC");
		assertEquals("BC",res);
	}
	@Test
	void testnA() {
		DelAinFirst2 obj = new DelAinFirst2();
		String res = obj.del("AABCAA");
		assertEquals("BCAA",res);
	}
	@Test
	void testonly1A() {
		DelAinFirst2 obj = new DelAinFirst2();
		String res = obj.del("A");
		assertEquals("",res);
	}
	@Test
	void testonly2A() {
		DelAinFirst2 obj = new DelAinFirst2();
		String res = obj.del("AA");
		assertEquals("",res);
	}
	@Test
	void testonlyA() {
		DelAinFirst2 obj = new DelAinFirst2();
		String res = obj.del("AAAA");
		assertEquals("AA",res);
	}
	@Test
	void testnoA() {
		DelAinFirst2 obj = new DelAinFirst2();
		String res = obj.del("BCD");
		assertEquals("BCD",res);
	}
}
