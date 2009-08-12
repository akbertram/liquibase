package liquibase.util;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class MD5UtilTest {

	private static final String TEST_STRING = "foo";
	private static final String TEST_STRING_MD5_HASH = "acbd18db4cc2f85cedef654fccc4a4d8";

    private static final String TEST_STRING2 = "abc";
    private static final String TEST_STRING2_MD5_HASH = "900150983cd24fb0d6963f7d28e17f72";

	@Test
	public void testComputeMD5() throws Exception {
		String hash = MD5Util.computeMD5(TEST_STRING);
		assertEquals(TEST_STRING_MD5_HASH, hash);

        String hash2 = MD5Util.computeMD5(TEST_STRING2);
        assertEquals(TEST_STRING2_MD5_HASH, hash2);
	}

	@Test
	public void testComputeMD5InputStream() {
		ByteArrayInputStream bais = new ByteArrayInputStream(TEST_STRING.getBytes());
		String hexString = MD5Util.computeMD5(bais);
		assertEquals(TEST_STRING_MD5_HASH, hexString);
	}

}