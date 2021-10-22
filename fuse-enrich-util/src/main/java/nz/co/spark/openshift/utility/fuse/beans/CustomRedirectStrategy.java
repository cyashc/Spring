package nz.co.spark.openshift.utility.fuse.beans;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.impl.client.DefaultRedirectStrategy;

@Contract(
        threading = ThreadingBehavior.IMMUTABLE
)
public class CustomRedirectStrategy  extends DefaultRedirectStrategy {
    public static final CustomRedirectStrategy INSTANCE = new CustomRedirectStrategy();

    public CustomRedirectStrategy() {
        super(new String[]{ "POST", "HEAD", "DELETE"});
    }
}
