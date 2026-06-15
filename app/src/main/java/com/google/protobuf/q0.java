package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFormatEscaper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class q0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFormatEscaper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteString f15506a;

        a(ByteString byteString) {
            this.f15506a = byteString;
        }

        @Override // com.google.protobuf.q0.b
        public byte a(int i10) {
            return this.f15506a.byteAt(i10);
        }

        @Override // com.google.protobuf.q0.b
        public int size() {
            return this.f15506a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextFormatEscaper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface b {
        byte a(int i10);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(ByteString byteString) {
        return b(new a(byteString));
    }

    static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte a10 = bVar.a(i10);
            if (a10 == 34) {
                sb.append("\\\"");
            } else if (a10 == 39) {
                sb.append("\\'");
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a10 >= 32 && a10 <= 126) {
                            sb.append((char) a10);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a10 >>> 6) & 3) + 48));
                            sb.append((char) (((a10 >>> 3) & 7) + 48));
                            sb.append((char) ((a10 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return a(ByteString.copyFromUtf8(str));
    }
}
