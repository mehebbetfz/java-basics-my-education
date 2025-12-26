package lesson_17;

public class Human {
	private Passport passport;

	// Этот класс существует сам по себе вне зависимости от Human и тому
	// доказательство то что мы можем создать паспорт в Runner
	public static class Passport {
		private String series;
		private PassportType passportType;

		public Passport(String series, PassportType passportType) {
			this.series = series;
			this.passportType = passportType;
		}
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
}
