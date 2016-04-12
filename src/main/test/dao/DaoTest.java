package dao;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mitruxa on 06.04.2016.
 */
public class DaoTest {

    @Test
    public void daoSaveNameMustReturnString() {
        String expected = "Sergey";
        String actual = Dao.saveName(expected);

        assertEquals(expected, actual);
    }
}
