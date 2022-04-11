package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.tools4j.spockito.Spockito;

/**
 * @author roded
 */
@RunWith(Spockito.class)
public class MySpockitoUnrollTest {

    @Test
    @Spockito.Unroll({
            "| ID | Name   | ETag                               |",
            "| A  | NameA  | 2ba4255c63ebbd3f4b5892fad61a6f6d-1 |",
            "| B  | NameB  | 2ba4255c63ebbd3f4b5892fad61a6f6d-1 |",
            "| C  | NameC  | 2ba4255c63ebbd3f4b5892fad61a6f6d-1 |",
            "| D  | NameD  | 2ba4255c63ebbd3f4b5892fad61a6f6d-1 |",
            "| E  | NameE  | 2ba4255c63ebbd3f4b5892fad61a6f6d-1 |",
            "| F  | NameF  | 2ba4255c63ebbd3f4b5892fad61a6f6d-1 |",
    })
    @Spockito.Name("{0}")
    public void MyTest(String id, String name, String etag) {

    }
}
