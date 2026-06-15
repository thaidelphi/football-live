package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdPlayerConfigRequestOuterClass {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AdPlayerConfigRequest extends GeneratedMessageLite<AdPlayerConfigRequest, Builder> implements AdPlayerConfigRequestOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 5;
        public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 1;
        private static final AdPlayerConfigRequest DEFAULT_INSTANCE;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
        private static volatile Parser<AdPlayerConfigRequest> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 2;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
        private int adFormat_;
        private int bitField0_;
        private ByteString configurationToken_;
        private ByteString impressionOpportunityId_;
        private String placementId_;
        private int webviewVersion_;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<AdPlayerConfigRequest, Builder> implements AdPlayerConfigRequestOrBuilder {
            /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearAdFormat();
                return this;
            }

            public Builder clearConfigurationToken() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearConfigurationToken();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearPlacementId();
                return this;
            }

            public Builder clearWebviewVersion() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearWebviewVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public InitializationResponseOuterClass.AdFormat getAdFormat() {
                return ((AdPlayerConfigRequest) this.instance).getAdFormat();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public int getAdFormatValue() {
                return ((AdPlayerConfigRequest) this.instance).getAdFormatValue();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public ByteString getConfigurationToken() {
                return ((AdPlayerConfigRequest) this.instance).getConfigurationToken();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((AdPlayerConfigRequest) this.instance).getImpressionOpportunityId();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public String getPlacementId() {
                return ((AdPlayerConfigRequest) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((AdPlayerConfigRequest) this.instance).getPlacementIdBytes();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public int getWebviewVersion() {
                return ((AdPlayerConfigRequest) this.instance).getWebviewVersion();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public boolean hasAdFormat() {
                return ((AdPlayerConfigRequest) this.instance).hasAdFormat();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public boolean hasWebviewVersion() {
                return ((AdPlayerConfigRequest) this.instance).hasWebviewVersion();
            }

            public Builder setAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setAdFormat(adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i10) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setAdFormatValue(i10);
                return this;
            }

            public Builder setConfigurationToken(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setConfigurationToken(byteString);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setPlacementId(str);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            public Builder setWebviewVersion(int i10) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setWebviewVersion(i10);
                return this;
            }

            private Builder() {
                super(AdPlayerConfigRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            AdPlayerConfigRequest adPlayerConfigRequest = new AdPlayerConfigRequest();
            DEFAULT_INSTANCE = adPlayerConfigRequest;
            GeneratedMessageLite.registerDefaultInstance(AdPlayerConfigRequest.class, adPlayerConfigRequest);
        }

        private AdPlayerConfigRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.configurationToken_ = byteString;
            this.placementId_ = "";
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.bitField0_ &= -3;
            this.adFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigurationToken() {
            this.configurationToken_ = getDefaultInstance().getConfigurationToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementId() {
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewVersion() {
            this.bitField0_ &= -2;
            this.webviewVersion_ = 0;
        }

        public static AdPlayerConfigRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdPlayerConfigRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdPlayerConfigRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i10) {
            this.bitField0_ |= 2;
            this.adFormat_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigurationToken(ByteString byteString) {
            byteString.getClass();
            this.configurationToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementId(String str) {
            str.getClass();
            this.placementId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewVersion(int i10) {
            this.bitField0_ |= 1;
            this.webviewVersion_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f26102a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdPlayerConfigRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0004\n\u0005ဌ\u0001\tင\u0000", new Object[]{"bitField0_", "configurationToken_", "placementId_", "impressionOpportunityId_", "adFormat_", "webviewVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdPlayerConfigRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (AdPlayerConfigRequest.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public InitializationResponseOuterClass.AdFormat getAdFormat() {
            InitializationResponseOuterClass.AdFormat forNumber = InitializationResponseOuterClass.AdFormat.forNumber(this.adFormat_);
            return forNumber == null ? InitializationResponseOuterClass.AdFormat.UNRECOGNIZED : forNumber;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public ByteString getConfigurationToken() {
            return this.configurationToken_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public int getWebviewVersion() {
            return this.webviewVersion_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public boolean hasWebviewVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AdPlayerConfigRequest adPlayerConfigRequest) {
            return DEFAULT_INSTANCE.createBuilder(adPlayerConfigRequest);
        }

        public static AdPlayerConfigRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdPlayerConfigRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdPlayerConfigRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdPlayerConfigRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public interface AdPlayerConfigRequestOrBuilder extends MessageLiteOrBuilder {
        InitializationResponseOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        ByteString getConfigurationToken();

        ByteString getImpressionOpportunityId();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        int getWebviewVersion();

        boolean hasAdFormat();

        boolean hasWebviewVersion();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26102a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f26102a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26102a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26102a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26102a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26102a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26102a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26102a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private AdPlayerConfigRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
