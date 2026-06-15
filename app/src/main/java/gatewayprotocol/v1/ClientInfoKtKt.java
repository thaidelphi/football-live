package gatewayprotocol.v1;

import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: ClientInfoKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ClientInfoKtKt {
    /* renamed from: -initializeclientInfo  reason: not valid java name */
    public static final ClientInfoOuterClass.ClientInfo m83initializeclientInfo(l<? super ClientInfoKt.Dsl, w> block) {
        n.f(block, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder newBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
        n.e(newBuilder, "newBuilder()");
        ClientInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo copy(ClientInfoOuterClass.ClientInfo clientInfo, l<? super ClientInfoKt.Dsl, w> block) {
        n.f(clientInfo, "<this>");
        n.f(block, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder builder = clientInfo.toBuilder();
        n.e(builder, "this.toBuilder()");
        ClientInfoKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
