public interface Sujeto{
	public void registrar(Espectador observador);
	public void eliminar(Espectador observador);
	public void notificar();
}
