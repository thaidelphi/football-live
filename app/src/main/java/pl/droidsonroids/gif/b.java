package pl.droidsonroids.gif;

import java.util.Locale;
/* compiled from: GifError.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public enum b {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(110, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(112, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(1002, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(1003, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f30017a;

    /* renamed from: b  reason: collision with root package name */
    int f30018b;

    b(int i10, String str) {
        this.f30018b = i10;
        this.f30017a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(int i10) {
        b[] values;
        for (b bVar : values()) {
            if (bVar.f30018b == i10) {
                return bVar;
            }
        }
        b bVar2 = UNKNOWN;
        bVar2.f30018b = i10;
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(this.f30018b), this.f30017a);
    }
}
