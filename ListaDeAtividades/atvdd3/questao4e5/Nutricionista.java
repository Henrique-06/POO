package questao4e5;

public class Nutricionista {
public ResultadoIMC avaliarIMC(Paciente p) {
	float imc= p.getPeso()/(p.getAltura()*p.getAltura());
	if (imc<18.5f) {
		return ResultadoIMC.BAIXOPESO;}
	else if (imc<25) {
			return ResultadoIMC.NORMAL;}
	else if(imc<30) {
			return ResultadoIMC.SOBREPESO;	}
	else;
	return ResultadoIMC.OBESIDADE;}
public enum ResultadoIMC{
	BAIXOPESO,NORMAL,SOBREPESO,OBESIDADE
}}