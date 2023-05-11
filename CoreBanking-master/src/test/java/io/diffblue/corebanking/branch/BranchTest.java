package io.diffblue.corebanking.branch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class BranchTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Branch#Branch(int, String, String)}
     *   <li>{@link Branch#setId(int)}
     *   <li>{@link Branch#setName(String)}
     *   <li>{@link Branch#getId()}
     *   <li>{@link Branch#getName()}
     *   <li>{@link Branch#getPostcode()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Branch actualBranch = new Branch(1, "Name", "OX1 1PT");
        actualBranch.setId(1);
        actualBranch.setName("Name");
        assertEquals(1, actualBranch.getId());
        assertEquals("Name", actualBranch.getName());
        assertEquals("OX1 1PT", actualBranch.getPostcode());
    }

    /**
     * Method under test: {@link Branch#setPostcode(String)}
     */
    @Test
    public void testSetPostcode() throws BranchException {
        Branch branch = new Branch(1, "Name", "OX1 1PT");
        branch.setPostcode("OX1 1PT");
        assertEquals("OX1 1PT", branch.getPostcode());
    }

    /**
     * Method under test: {@link Branch#setPostcode(String)}
     */
    @Test
    public void testSetPostcode2() throws BranchException {
        assertThrows(BranchException.class, () -> (new Branch(1, "Name", "OX1 1PT")).setPostcode("foo"));
    }
}

