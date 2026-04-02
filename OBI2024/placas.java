import java.util.Scanner;
public class placas {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String placa = in.next();
		
		if (placa.length() == 8) {
			if (Character.isAlphabetic(placa.charAt(0)) == true) {
				if (Character.isAlphabetic(placa.charAt(1)) == true) {
					if (Character.isAlphabetic(placa.charAt(2)) == true) {
						if (Character.isDigit(placa.charAt(3)) == false) {
							if (Character.isDigit(placa.charAt(4)) == true) {
								if (Character.isDigit(placa.charAt(5)) == true) {
									if (Character.isDigit(placa.charAt(6)) == true) {
										if (Character.isDigit(placa.charAt(7)) == true) {
											System.out.println(1);
										}
										else {
											System.out.println(0);
										}
									}
									else {
										System.out.println(0);
									}
								}
								else {
									System.out.println(0);
								}
							}
							else {
								System.out.println(0);
							}
						}
						else {
							System.out.println(0);
						}
					}
					else {
						System.out.println(0);
					}
				}
				else {
					System.out.println(0);
				}
			}
			else {
				System.out.println(0);
			}
		}
		else if (placa.length() == 7) {
			if (Character.isAlphabetic(placa.charAt(0)) == true) {
				if (Character.isAlphabetic(placa.charAt(1)) == true) {
					if (Character.isAlphabetic(placa.charAt(2)) == true) {
						if (Character.isDigit(placa.charAt(3)) == true) {
							if (Character.isAlphabetic(placa.charAt(4)) == true) {
								if (Character.isDigit(placa.charAt(5)) == true) {
									if (Character.isDigit(placa.charAt(6)) == true) {
										System.out.println(2);
									}
									else {
										System.out.println(0);
									}
								}
								else {
									System.out.println(0);
								}
							}
							else {
								System.out.println(0);
							}
						}
						else {
							System.out.println(0);
						}
					}
					else {
						System.out.println(0);
					}
				}
				else {
					System.out.println(0);
				}
			}
			else {
				System.out.println(0);
			}
		}
		else {
			System.out.println(0);
		}
	}
}
