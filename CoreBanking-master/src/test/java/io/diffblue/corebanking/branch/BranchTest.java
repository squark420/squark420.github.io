package io.diffblue.corebanking.branch;

import static org.junit.Assert.assertEquals;

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
}

