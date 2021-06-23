package Entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {

//METODO PARA VALIDACAO DE USUARIO
    public boolean loginUsuario(Usuario login) {
        String sql = "SELECT * FROM tb_usuario WHERE usuario = ? AND senha = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection con = factory.getConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getSenha());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                login.setCargo(rs.getString("cargo"));
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //METODO PARA CADASTRAR NOVOS ATENDENTES
    public void createAtendente(Usuario criaAtendente) {
        String sqlcheckuser = "SELECT * FROM tb_usuario WHERE usuario = ?";
        String sqlcheckname = "SELECT * FROM tb_usuario WHERE nome = ?";
        String sql = "INSERT INTO tb_usuario (usuario, senha, nome, fone, cargo) VALUES (?, ?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection con = factory.getConexao()) {
            PreparedStatement pscheckuser = con.prepareStatement(sqlcheckuser);
            PreparedStatement pscheckname = con.prepareStatement(sqlcheckname);
            pscheckuser.setString(1, criaAtendente.getUsuario());
            pscheckname.setString(1, criaAtendente.getNome());
            ResultSet rsuser = pscheckuser.executeQuery();
            ResultSet rsname = pscheckname.executeQuery();
            if (rsuser.next()) {
                JOptionPane.showMessageDialog(null, "Usuário já existe na base!\nFavor criar usuário diferente do digitado.", "Duplicidade", JOptionPane.INFORMATION_MESSAGE);
            } else if (rsname.next()) {
                JOptionPane.showMessageDialog(null, "Nome já existe na base!\nFavor utilizar outro nome para este usuário.", "Duplicidade", JOptionPane.INFORMATION_MESSAGE);
            } else {

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, criaAtendente.getUsuario());
                ps.setString(2, criaAtendente.getSenha());
                ps.setString(3, criaAtendente.getNome());
                ps.setString(4, criaAtendente.getFone());
                ps.setString(5, criaAtendente.getCargo());
                int x = JOptionPane.showConfirmDialog(null, "Você quer adicionar o seguinte Atendente?\n\n"
                        + "Usuário: " + criaAtendente.getUsuario() + "\nSenha: " + criaAtendente.getSenha()
                        + "\nNome: " + criaAtendente.getNome() + "\nFone: " + criaAtendente.getFone(),
                        "Confirmação", JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Atendente cadastrado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cancelado!");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //METODO PARA DELETAR ATENDENTES
    public void deleteAtendente(Usuario removeAtendente) {
        String sql = "DELETE FROM tb_usuario WHERE usuario = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection con = factory.getConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, removeAtendente.getUsuario());
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //METODO PARA CRIAR ADMINISTRADORES
    public void createAdm(Usuario criaAdm) {
        String sqlcheckuser = "SELECT * FROM tb_usuario WHERE usuario = ?";
        String sqlcheckname = "SELECT * FROM tb_usuario WHERE nome = ?";
        String sql = "INSERT INTO tb_usuario (usuario, senha, nome, fone, cargo) VALUES (?, ?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection con = factory.getConexao()) {
            PreparedStatement pscheckuser = con.prepareStatement(sqlcheckuser);
            PreparedStatement pscheckname = con.prepareStatement(sqlcheckname);
            pscheckuser.setString(1, criaAdm.getUsuario());
            pscheckname.setString(1, criaAdm.getNome());
            ResultSet rsuser = pscheckuser.executeQuery();
            ResultSet rsname = pscheckname.executeQuery();
            if (rsuser.next()) {
                JOptionPane.showMessageDialog(null, "Usuário já existe na base!\nFavor criar usuário diferente do digitado.", "Duplicidade", JOptionPane.INFORMATION_MESSAGE);
            } else if (rsname.next()) {
                JOptionPane.showMessageDialog(null, "Nome já existe na base!\nFavor utilizar outro nome para este usuário.", "Duplicidade", JOptionPane.INFORMATION_MESSAGE);
            } else {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, criaAdm.getUsuario());
                ps.setString(2, criaAdm.getSenha());
                ps.setString(3, criaAdm.getNome());
                ps.setString(4, criaAdm.getFone());
                ps.setString(5, criaAdm.getCargo());

                int x = JOptionPane.showConfirmDialog(null, "Você quer adicionar o seguinte Administrador?\n\n"
                        + "Usuário: " + criaAdm.getUsuario() + "\nSenha: " + criaAdm.getSenha()
                        + "\nNome: " + criaAdm.getNome() + "\nFone: " + criaAdm.getFone(),
                        "Confirmação", JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Administrador cadastrado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cancelado!");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //METODO PARA REMOVER ADMINISTRADORES
    public void deleteAdm(Usuario removeAdm) {
        String sql = "DELETE FROM tb_usuario WHERE usuario = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection con = factory.getConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, removeAdm.getUsuario());
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //METODO PARA LISTAR ADMINISTRADORES
    public ArrayList<Usuario> listAdm() {
        ArrayList<Usuario> adm = new ArrayList<>();

        String sql = "SELECT * FROM tb_usuario WHERE cargo = 'ADM' AND ID != 1";
        ConnectionFactory factory = new ConnectionFactory();
        Usuario x;

        try (Connection con = factory.getConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                x = new Usuario(
                        rs.getString("usuario"),
                        rs.getString("nome"),
                        rs.getString("fone")
                );
                adm.add(x);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return adm;
    }

    //METODO PARA LISTAR ATENDENTES
    public ArrayList<Usuario> listAtendente() {
        ArrayList<Usuario> atendente = new ArrayList<>();

        String sql = "SELECT * FROM tb_usuario WHERE cargo = 'ATE'";
        ConnectionFactory factory = new ConnectionFactory();
        Usuario x;

        try (Connection con = factory.getConexao()) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                x = new Usuario(
                        rs.getString("usuario"),
                        rs.getString("nome"),
                        rs.getString("fone")
                );
                atendente.add(x);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return atendente;
    }
}
