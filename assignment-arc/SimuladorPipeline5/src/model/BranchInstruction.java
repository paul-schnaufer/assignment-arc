package model;

/*
 * TODO: Implement the BranchInstruction class.
 * 
 * blt rs, rt - Branch if rs < rt
 * bgt rs, rt - Branch if rs > rt
 * beq rs, rt - Branch if rs == rt
 * j - Jump to address
 */
public class BranchInstruction extends Instruction {

    public BranchInstruction(String text, String opcode, String rd, String rs, String rt, String imm, int address) {
        super(text, opcode, rd, rs, rt, imm, address);
    }
}
