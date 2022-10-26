import java.time.LocalDate;

public class ServidorAtivo extends Pessoa 
{
	private LocalDate periodo;
	private float remuneracao;
	private float comissao;
	private float beneficios;
	private float eventuais;
	private float horasExtras;
	private float judiciais;
	private float tetoRedutor;
	private float IRRF;
	private float contribPrev;
	private float totalLiquido;
	
	public enum orgao{
		ADEAL, 
		AMGESP, 
		ARSAL, 
		ALPREV,
		CARHP,
		CGE,
		CBM_AL,
		DER,
		DETRAN,
		DITEAL,
		FAPEAL,
		GMAL,
		CVG,
		IPASEAL,
		IDERAL,
		EMATER,
		INMEQ,
		PROCON,
		ITEC,
		ITERAL,
		IMA,
		IZP,
		LIFAL,
		PO,
		PC,
		PM,
		PGE,
		SEAGRI,
		SEADES,
		SECTI,
		SECOM,
		SECULT,
		SEDUC,
		SEFAZ,
		SEINFRA,
		SEMUDH,
		SESAU,
		SSP,
		SEPREV,
		SERIS,
		SETRAND,
		SEDETUR,
		SELAJ,
		SEMARH,
		SEPLAG,
		SETE,
		SERVEAL,
		UNEAL,
		UNCISAL;
	}
	
	
}

