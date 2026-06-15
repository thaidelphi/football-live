package d1;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
/* compiled from: WebMessageAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l implements WebMessageBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f23891a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static c1.e[] a(InvocationHandler[] invocationHandlerArr) {
        c1.e[] eVarArr = new c1.e[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            eVarArr[i10] = new n(invocationHandlerArr[i10]);
        }
        return eVarArr;
    }

    public static c1.d b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        c1.e[] a10 = a(webMessageBoundaryInterface.getPorts());
        if (p.C.c()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) z9.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    return null;
                }
                return new c1.d(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), a10);
            }
            return new c1.d(webMessagePayloadBoundaryInterface.getAsString(), a10);
        }
        return new c1.d(webMessageBoundaryInterface.getData(), a10);
    }
}
