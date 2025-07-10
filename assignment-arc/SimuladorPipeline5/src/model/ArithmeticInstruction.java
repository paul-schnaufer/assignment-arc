package model;

/*
 * TODO: Implement the ArithmeticInstruction class.
 * add rd, rs, rt - Adds the values in registers rs and rt, and stores the result in rd.
 * 
 * addi rd, rs, imm - Adds the immediate value imm to the value in register rs, and stores the result in rd.
 * 
 * sub rd, rs, rt - Subtracts the value in register rt from the value in register rs, and 
 * stores the result in rd.
 * 
 * subi rd, rs, imm - Subtracts the immediate value imm from the value in register rs, and
 * stores the result in rd.
 * 
 * mul rd, rs, rt - Multiplies the values in registers rs and rt, and stores the result in rd.
 * 
 * div rd, rs, rt - Divides the value in register rs by the value in register rt, and stores
 * the result in rd.
 * 
 * mod rd, rs, rt - Computes the remainder of the division of the value in register rs by
 * the value in register rt, and stores the result in rd.
 */
public class ArithmeticInstruction extends Instruction {

    public ArithmeticInstruction(String text, String opcode, String rd, String rs, String imm, int address) {
        super(text, opcode, rd, rs, rt, imm, address);
    }

    @Override
    public void execute(RegisterFile registers, DataMemory memory, PipelineRegisters pipelineRegs) {
        int rsValue = 0;
        int rtValue = 0;
        int result = 0;
        // TODO: Implement the reading of the rs and rt registers or immediate value

        // Executa operação
        switch (opcode) {
            case "add":
            case "addi":
                result = rsValue + rtValue;
                break;
            case "sub":
            case "subi":
                result = rsValue - rtValue;
                break;
            case "mul":
                result = rsValue * rtValue;
                break;
            case "div":
                if (rtValue != 0) {
                    result = rsValue / rtValue;
                } else {
                    result = 0; // Tratamento simples para divisão por zero
                }
                break;
        }

        // TODO: Implement the writing of the result to the rd register
    }
}