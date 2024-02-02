class Ev {
    private String tip;
    private int odasayisi;
    private int banyosayisi;
    private String semt;

    private Ev(String tip, int odasayisi, int banyosayisi, String semt) {
        this.tip = tip;
        this.odasayisi = odasayisi;
        this.banyosayisi = banyosayisi;
        this.semt = semt;
    }

    static class EvBuilder {
        private String tip;
        private int odasayisi;
        private int banyosayisi;
        private String semt;

        public EvBuilder(String tip) {
            this.tip = tip;
        }

        public EvBuilder odasayisi(int odasayisi) {
            this.odasayisi = odasayisi;
            return this;
        }

        public EvBuilder banyosayisi(int banyosayisi) {
            this.banyosayisi = banyosayisi;
            return this;
        }

        public EvBuilder semt(String semt) {
            this.semt = semt;
            return this;
        }

        public Ev build() {
            return new Ev(tip, odasayisi, banyosayisi, semt);
        }

        // Lombok olmadan toString metodu bunu eklemek gerekiyormuş.
        @Override
        public String toString() {
            return "EvBuilder{" +
                    "tip='" + tip + '\'' +
                    ", odasayisi=" + odasayisi +
                    ", banyosayisi=" + banyosayisi +
                    ", semt='" + semt + '\'' +
                    '}';
        }
    }
}

public class EvBuilderPattern {
    public static void main(String[] args) {
        Ev.EvBuilder evBuilder = new Ev.EvBuilder("Dubleks müstakil");
        Ev ev = evBuilder
                .odasayisi(4)
                .banyosayisi(2)
                .semt("Yaşamkent")
                .build();

        System.out.println("Satılık Ev: " + evBuilder);

    }
}