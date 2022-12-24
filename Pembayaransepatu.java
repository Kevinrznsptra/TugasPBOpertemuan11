public class Pembayaransepatu extends Pembayaran{

    Pembayaransepatu(double biaya){
        super(biaya);
    }

    @Override
    double pembayaran() {
        return super.getBayarsepatu();
    }
}
