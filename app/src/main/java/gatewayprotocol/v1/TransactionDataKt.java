package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: TransactionDataKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TransactionDataKt {
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    /* compiled from: TransactionDataKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        /* compiled from: TransactionDataKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            TransactionEventRequestOuterClass.TransactionData build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            n.e(eventId, "_builder.getEventId()");
            return eventId;
        }

        public final String getProduct() {
            String product = this._builder.getProduct();
            n.e(product, "_builder.getProduct()");
            return product;
        }

        public final String getProductId() {
            String productId = this._builder.getProductId();
            n.e(productId, "_builder.getProductId()");
            return productId;
        }

        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            n.e(receipt, "_builder.getReceipt()");
            return receipt;
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            n.e(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            n.e(transaction, "_builder.getTransaction()");
            return transaction;
        }

        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            n.e(transactionId, "_builder.getTransactionId()");
            return transactionId;
        }

        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            n.e(transactionState, "_builder.getTransactionState()");
            return transactionState;
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setEventId(ByteString value) {
            n.f(value, "value");
            this._builder.setEventId(value);
        }

        public final void setProduct(String value) {
            n.f(value, "value");
            this._builder.setProduct(value);
        }

        public final void setProductId(String value) {
            n.f(value, "value");
            this._builder.setProductId(value);
        }

        public final void setReceipt(String value) {
            n.f(value, "value");
            this._builder.setReceipt(value);
        }

        public final void setTimestamp(Timestamp value) {
            n.f(value, "value");
            this._builder.setTimestamp(value);
        }

        public final void setTransaction(String value) {
            n.f(value, "value");
            this._builder.setTransaction(value);
        }

        public final void setTransactionId(String value) {
            n.f(value, "value");
            this._builder.setTransactionId(value);
        }

        public final void setTransactionState(TransactionEventRequestOuterClass.TransactionState value) {
            n.f(value, "value");
            this._builder.setTransactionState(value);
        }
    }

    private TransactionDataKt() {
    }
}
